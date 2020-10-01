package chap16;

//Ŭ���̾�Ʈ : ChatClientŬ����

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIChatClient extends JFrame implements Runnable, ActionListener {
	private static final long serialVersionUID = 1L;

	BufferedReader input; // �Է½�Ʈ��
	PrintWriter output; // ��½�Ʈ��
	Thread handler; // ChatHandler�� �޽����� �ְ� �ޱ� ���� ������
	Container c;
	JTextArea display; // ä��â���� ��ȭ�� ǥ��
	JTextField id; // ����� id
	JTextField inData; // ����ڰ� �޽����� �Է��ϴ� �ʵ�
	JLabel displayId; // ä��â�� idǥ���ϴ� ���̺�
	JButton send; // [������]��ư
	CardLayout window;

	// �����ڷ� ä��â�� UI�� ����
	public GUIChatClient() {
		super("ä�� Ŭ���̾�Ʈ");

		// �����̳ʿ� ���̾ƿ� �Ŵ��� ����
		c = getContentPane();
		window = new CardLayout();
		c.setLayout(window);

		// �α��� â�� ����
		JPanel login = new JPanel(new BorderLayout());
		JPanel bottom = new JPanel();
		JLabel idLable = new JLabel("�α���:");
		// ���̵� �Է��ʵ��� ������ ������ ���
		id = new JTextField(15);
		id.addActionListener(this);
		// �α���â�� ������Ʈ��ġ
		bottom.add(idLable);
		bottom.add(id);
		login.add("South", bottom);
		c.add("login", login);
		// ä��â�� ����
		JPanel chat = new JPanel(new BorderLayout());
		// ä��â�� ��ȭ ǥ�� �ؽ�Ʈ������ ���� �� ��ũ�ѹ� �߰�, ��ġ
		display = new JTextArea(10, 30);
		JScrollPane s = new JScrollPane(display);
		chat.add("Center", s);// �гο� �߰�
		display.setEditable(false); // ��ȭǥ�� ȭ�鿡 ���Ƿ� �Է� ����
		// ä��â�� �޽����Է°�[������]��ư ������ ��ġ
		JPanel mess = new JPanel();
		mess.add(new JLabel("�޽���"));
		// �޽��� �Է��ʵ��� ������ ������ ���, ��ġ
		inData = new JTextField(20);
		mess.add(inData);
		inData.addActionListener(this);
		// [������]��ư�� ������ ������ ���, ��ġ
		send = new JButton("������");
		mess.add(send);
		send.addActionListener(this);
		// ä��â�� ������Ʈ ��ġ
		chat.add("South", mess);
		displayId = new JLabel();
		chat.add("North", displayId);
		c.add("chat", chat);
		window.show(c, "login");

		setSize(400, 400);
		setVisible(true);
	}

	// ChatHandler�� �޽����� �ְ���� �����ϴ� ������ ���� �� �����Ŵ
	public void clientStart() {
		handler = new Thread(this);
		handler.start();
	}

	// �����带 ����� �ڵ����� ����
	public void run() {
		try {
			// ���ϰ�ü ����
			Socket s = new Socket("127.0.0.1", 5001);
			// ����½�Ʈ�� ��
			input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			output = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			// ������ �ڵ鷯�� ���� �޽����� �޴� execute()�޼ҵ�
			execute();
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}

	// ������ �ڵ鷯�� ChatHandler�� ���� �޽����� �޾Ƽ� ��ȭȭ�鿡 ǥ��
	public void execute() {
		try {
			while (true) {// ������ �޽����� ����
				// ���� �޽����� ��ȭȭ�鿡 ǥ��
				String line = input.readLine();
				display.append(line + "\n");
			}
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		} finally {// �޽��� �޴� ���� �ߴܵɶ� ����
			stop();
		}
	}

	// �������� ������ �ߴܽ� ����ϴ� �޼ҵ�
	public void stop() {
		if (handler != null) {
			try {
				if (output != null) {
					input.close();
					output.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		// ����� ������ ����
		handler = null;
	}

	// ������� ���̵� ó���� ������ �ڵ鷯�� �޽����� ������ ���� ó��
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ�� �߻��� ������Ʈ ��
		Component event = (Component) e.getSource();
		// �̺�Ʈ�� �߻��� ������Ʈ�� ���̵� �Է��ʵ��̸� ����
		if (event == id) {
			// ���̵� �� ä��â�� �������� ǥ��
			String name = id.getText().trim();
			displayId.setText(name);
			// ���̵� �Է����� ������ �����ߴ�.
			if (name == null || name.length() == 0) {
				return;
			}
			// ������ �ڵ鷯�� ChatHandler�� �޽��� ����
			output.println(name);
			output.flush();
			// ä��â�� ǥ�õǵ�����
			window.show(c, "chat");
			inData.requestFocus();
			// �̺�Ʈ�� �߻��� �޽��� �Է� �ʵ峪 [������]��ư�̸� ����
		} else if (event == inData || event == send) {
			// ������ �ڵ鷯�� ChatHandler�� �޽��� ����
			output.println(inData.getText());
			output.flush();
			inData.setText("");
		}
	}
}
