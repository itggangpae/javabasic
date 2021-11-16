package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MulticastReceiver {

	public static void main(String[] args) {

		DatagramPacket packet = null;
		MulticastSocket socket = null;

		try {
			socket = new MulticastSocket(9006);
			System.out.printf("멀티캐스트 수신자 생성\n");

			// 그룹에 조인(라우터가 보냄)
			InetAddress address = InetAddress.getByName("224.128.1.5"); // 멀티 캐스트를 위한 아이피 설정
			socket.joinGroup(address);

			byte[] buf = new byte[512];

			packet = new DatagramPacket(buf, buf.length);

			while (true) {
				// 패킷 수신
				socket.receive(packet);

				String msg = new String(packet.getData(), 0, packet.getLength());
				System.out.printf("%s\n", msg);
			}

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}