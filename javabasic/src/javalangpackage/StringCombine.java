package javalangpackage;

public class StringCombine {

	public static void main(String[] args) {
		String first = "Java"; 
		String second = "String";
		//StringBuiler를 이용한 문자열 결합
		StringBuilder builder = new StringBuilder(); 
		builder.append(first);
		builder.append(second);
		String str = builder.toString(); 
		System.out.println(str);
		
		//+ 연산자를 이용한 결합 
		str = first + second; 
		System.out.println(str);
		
		//concat 메소드를 이용한 결합
		str = first.concat(second); 
		System.out.println(str);
		
		//format 메소드를 이용한 결합
		str = String.format("%s%s",first, second); 
		System.out.println(str);
		
	}
}
