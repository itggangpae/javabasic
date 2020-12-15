package chap10;

public class StringCombine {

	public static void main(String[] args) {
		String first = "Java"; 
		String second = "String";
		StringBuilder builder = new StringBuilder(); 
		builder.append(first);
		builder.append(second);
		String str = builder.toString(); 
		System.out.println(str);
		
		str = first + second; 
		System.out.println(str);
		
		str = first.concat(second); 
		System.out.println(str);
		
	}
}
