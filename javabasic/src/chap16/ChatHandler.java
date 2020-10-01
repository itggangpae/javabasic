package chap16;

//������ �ڵ鷯 : ChatHandlerŬ����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import chap16.GUIChatServer;

public class ChatHandler extends Thread {
	Socket client; // ���� ��ü
	BufferedReader input; // �Է½�Ʈ��
	PrintWriter output; // ��½�Ʈ��
	GUIChatServer server; // ���� ��ü

	// ������, ���ϰ�ü�κ��� ����� ��Ʈ���� ��
	public ChatHandler(GUIChatServer server, Socket client) throws IOException {
		this.server = server;
		this.client = client;

		input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
	}

	// Ŭ���̾�Ʈ�� ���� �޽����� �д� �޼ҵ�
	public void run() {
		String name = "";
		try {
			// Ŭ���̾�Ʈ�� �����޽��� ����
			name = input.readLine();
			// Ŭ���̾�Ʈ�� �����޽����� ��� Ŭ���̾�Ʈ���� �߰�(����)
			// ��� ����ڿ��� �޽����� �߰��ϴ� broadcast()�޼ҵ� ȣ��
			broadcast(name + " �� ����.");
			// ������ Ŭ���̾�Ʈ�� ���� �޽����� ���� �� �ֵ��� ���ѷ����� ó��
			while (true) {
				// Ŭ���̾�Ʈ�� ���� �޽��� ����
				String msg = input.readLine();
				// ��� ����ڿ��� �޽����� �߰��ϴ� broadcast()�޼ҵ� ȣ��
				broadcast(name + " : " + msg);
			}
		} catch (Exception ex) {
			System.out.println(name + " �� ����, " + "IP: " + client.getInetAddress());

		} finally {// ä��â�� �ݱ���߸� Ŭ���ϸ� ����
			server.handlers.removeElement(this);
			broadcast(name + " �� ����");
			try {// ���ҽ� ����
				input.close();
				output.close();
				client.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	// ���� ������ ��� Ŭ���̾�Ʈ���� �޽����� ����
	protected void broadcast(String message) {
		// ��� ����ڵ鿡�� �޽����� �߰��ϴ� ����
		// ���Ϳ��� Ŭ���̾�Ʈ�� �߰��� ���Ű� �ȵ�
		synchronized (server.handlers) {
			// ���� ���;ȿ� �ִ� Ŭ���̾�Ʈ�� ���� ��
			int n = server.handlers.size();

			// ������ ��� ����ڿ��� �޽����� ������ ���� ������� ����ŭ �ݺ�
			for (int i = 0; i < n; i++) {
				// Ŭ���̾�Ʈ �ϳ��� ��
				ChatHandler handler = server.handlers.elementAt(i);
				try {
					// �޽����� ������ ���� ��½�Ʈ���� �ٸ������� �����ϰ� ��
					synchronized (handler.output) {
						// Ŭ���̾�Ʈ���� �޽��� ����
						handler.output.println(message);
					}
					handler.output.flush();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
