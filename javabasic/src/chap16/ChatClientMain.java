package chap16;

import chap16.GUIChatClient;

public class ChatClientMain {
	public static void main(String[] args) {
		GUIChatClient client  = new GUIChatClient();
		Thread th = new Thread(client);
		th.start();
	}
}
