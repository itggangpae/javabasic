import java.io.*;
import java.net.*;

public class SocketServer {
	public static void main(String[] args) {
		try {
			int portNumber = 11001;
			System.out.println("Starting Java Socket Server ...");
			ServerSocket aServerSocket = new ServerSocket(portNumber);
			System.out.println("Listening at port " + portNumber + " ...");

			while (true) {
				Socket aSocket = aServerSocket.accept();
				InetAddress clientHost = aSocket.getLocalAddress();
				int clientPort = aSocket.getPort();
				System.out.println("A client connected. host : " + clientHost
						+ ", port : " + clientPort);				
				ObjectInputStream instream = new ObjectInputStream(
						aSocket.getInputStream());
				Object obj = instream.readObject();
				System.out.println("Input : " + obj);

				ObjectOutputStream outstream = new ObjectOutputStream(
						aSocket.getOutputStream());
				outstream.writeObject(obj + " from Server.");
				outstream.flush();
				aSocket.close();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
