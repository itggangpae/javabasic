import java.rmi.*;
public class HelloClient{
public static void main(String[] args){
	try{
	  Hello h=(Hello)Naming.lookup("rmi://127.0.0.1:1099/test");
	  String str=h.sayHello("Jessica");
	  System.out.println();
	  System.out.println("result : " + str);
	}catch(Exception ex){ System.out.println(ex); }
	}
}
