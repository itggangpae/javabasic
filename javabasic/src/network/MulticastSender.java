package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSender {

	public static void main(String[] args) {

		DatagramPacket packet = null;
		MulticastSocket socket = null;

		try {
			socket = new MulticastSocket();
			System.out.println("서버 생성 성공.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			InetAddress address = InetAddress.getByName("224.128.1.5"); // 멀티캐스트 방식으로 서버 주소를 설정함.

			System.out.printf("대화명 입력 : ");
			String nickname = reader.readLine();

			while (true) {
				System.out.printf("메시지 : ");
				String msg = reader.readLine();
				if (msg.equals("종료")) {
					msg = nickname + "님이 퇴장하셨습니다.";
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 9006);
					socket.send(packet);
					break;
				} else {
					msg = nickname + " > " + msg;
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 9006);
					socket.send(packet);
				}
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}