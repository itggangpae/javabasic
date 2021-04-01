package datatype;
public class SystemWord 
{
	public static void main(String args[])
	{
		//10진수 , 8진수, 16진수 표현
		System.out.println(12 + 017 + 0xb); //12 + 15 + 11
		int i = 020;
		int j = 0xf;
		System.out.println("i=" + i + '\t' + "j=" +j);   // 16 15 
	}
}
