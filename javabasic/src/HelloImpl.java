import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {
	private static final long serialVersionUID = 1L;

	public HelloImpl() throws RemoteException {}

	public String sayHello(String name) throws RemoteException {
		System.out.println("Server Working Start");
		return name + " Welcome To MyServer";
	}
}