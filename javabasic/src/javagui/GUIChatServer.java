package javagui;

//서버: ChatServer클래스
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class GUIChatServer {
	//클라이언트를 저장하기 위한 벡터, 클라이언트는 쓰레드인 ChatHandler인스턴스로 저장
	Vector<ChatHandler> handlers;

	public GUIChatServer (int port) {
		try {
			//서버 Socket 인스턴스생성 , 사용자는 최대 50까지 받을 수 있음
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket (port);
			//클라이언트를 관리하는 벡터생성 
			handlers = new Vector<ChatHandler>();

			System.out.println("채팅 서버 준비완료");

			//무한히 클라이언트를 받을 수 있도록 무한루프로 처리
			while (true) {
				//Socket인스턴스 얻어냄
				Socket client = server.accept ();
				System.out.println ("접속한 클라이언트 IP: " + client.getInetAddress());
				//클라이언트당 1개씩 ChatHandler인스턴스 생성
				ChatHandler ch = new ChatHandler(this, client);
				//클라이언트 관리 벡터에 접속한 클라이언트 추가
				handlers.addElement(ch);
				//ChatHandler클래스의 run()메서드가 호출됨
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