package chap16;

//����: ChatServerŬ����
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import chap16.ChatHandler;

public class GUIChatServer {
	// Ŭ���̾�Ʈ�� �����ϱ� ���� ����, Ŭ���̾�Ʈ�� �������� ChatHandler��ü�� ����
	Vector<ChatHandler> handlers;

	public GUIChatServer(int port) {
		try {
			//���� ���� ��ü���� , ����ڴ� �ִ� 50���� ���� �� ����
			ServerSocket server = new ServerSocket (port);
	        //Ŭ���̾�Ʈ�� �����ϴ� ���ͻ��� 
			handlers = new Vector<ChatHandler>();
	         
			System.out.println("ä�� ���� �غ�Ϸ�");
	        
		
			//������ Ŭ���̾�Ʈ�� ���� �� �ֵ��� ���ѷ����� ó��
			while (true) {
				//���ϰ�ü ��
	           Socket client = server.accept ();
	           System.out.println ("������ Ŭ���̾�Ʈ IP: " + client.getInetAddress());
	           //Ŭ���̾�Ʈ�� 1���� ChatHandler��ü ����
	           ChatHandler ch = new ChatHandler(this, client);
	           //Ŭ���̾�Ʈ ���� ���Ϳ� ������ Ŭ���̾�Ʈ �߰�
	           handlers.addElement(ch);
	           //ChatHandlerŬ������ run()�޼ҵ尡 ȣ���
	           ch.start ();
	       }
	    }catch(EOFException eofe){
	        eofe.printStackTrace();
	    }catch(IOException ioe){
	        ioe.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		new GUIChatServer(5001);
	}
}
