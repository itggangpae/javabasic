package operator;

public class ShortCut {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n > 5 && n++ > 10); //앞의 조건이 true 이므로 뒤의 표현식을 확인 
		System.out.println("n:" + n);
		
		n = 10;
		System.out.println(n < 5 && n++ > 10); //앞의 조건이 false 이므로 뒤의 표현식을 확인하지 않음 
		System.out.println("n:" + n);
		
		n = 10;
		System.out.println(n < 5 & n++ > 10); //short cut이 적용되지 않음  
		System.out.println("n:" + n);
			
	}
}
