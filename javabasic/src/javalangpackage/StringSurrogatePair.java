package javalangpackage;

public class StringSurrogatePair {
	public static void main(String[] args) {
		String str = "λλΉπ¦";
		char[] chars = str.toCharArray(); 
		for (char c : chars) {
			if (Character.isLowSurrogate(c) || Character.isHighSurrogate(c)) { 
				System.out.println("μλ‘κ²μ΄νΈ νμ΄ λ¬Έμ");
			}else {
				System.out.println("μλ‘κ²μ΄νΈ νμ΄ μλ λ¬Έμ"); 
			}
		}
		System.out.println(str.length()); 
		System.out.println(str.codePointCount(0, str.length()));
	}
}
