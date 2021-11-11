import java.rmi.*;
public class HelloServer {
	public static void main(String[] args) throws Exception{
		HelloImpl impl=new HelloImpl();
		Naming.rebind("rmi://127.0.0.1:1099/test", impl);
		System.out.println("Remote Object HelloImpl is binding");
	}
}