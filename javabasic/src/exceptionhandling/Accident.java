package exceptionhandling;

import java.util.Scanner;

public class Accident  
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			int jumsu = sc.nextInt();
			if(jumsu>100)
			{
				throw new NumberFormatException("점수가 너무 큼");  
				// 예외의 인위적 발생
			}
		} 
		catch(NumberFormatException e) 
		{
			System.out.println("==================================");
			System.out.println(e.getMessage() + "예외 발생");
		}
		finally {
			sc.close();
		}
	}
}	
