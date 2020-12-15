package chap10;

public class StringSurrogatePair {
	public static void main(String[] args) {
		String str = "나비🦋";
		char[] chars = str.toCharArray(); 
		for (char c : chars) {
			if (Character.isLowSurrogate(c) || Character.isHighSurrogate(c)) { 
				System.out.println("서로게이트 페어 문자");
			}else {
				System.out.println("서로게이트 페어 아닌 문자"); 
			}
		}
		System.out.println(str.length()); 
		System.out.println(str.codePointCount(0, str.length()));
	}
}
