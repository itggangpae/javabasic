package oop_1;

class StaticTest
{
	static private String message = "STATIC";
	
	public static String getString()
	{
		return message;
	}
}

public class StaticTestMain
{
	public static void main(String[] args)
	{
		//static 메소드는 인스턴스 생성없이 호출하는 것이 가능
		System.out.println("message : "+StaticTest.getString());
	}
}
