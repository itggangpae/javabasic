package javalangpackage;

public class StringSurrogate {
	public static void main(String[] args) {
		String str1 = "James 안녕";
		char[] chars = str1.toCharArray(); 
		boolean flag = false;
		for (char c : chars) {
			if (Character.isLowSurrogate(c) || Character.isHighSurrogate(c)) {
				System.out.println("서로게이트 페어가 포함되어 있는 문자열");
				flag = true;
				break;
			} 
		}
		if(flag == false) {
			System.out.println("서로게이트 페어가 포함되어 있지 않은 문자열");
		}
		
		String str2 = "🦕 안녕";
		chars = str2.toCharArray(); 
	    flag = false;
		for (char c : chars) {
			if (Character.isLowSurrogate(c) || Character.isHighSurrogate(c)) {
				System.out.println("서로게이트 페어가 포함되어 있는 문자열");
				flag = true;
				break;
			} 
		}
		if(flag == false) {
			System.out.println("서로게이트 페어가 포함되어 있지 않은 문자열");
		}
		
		System.out.println(str2.length()); 
		System.out.println(str2.codePointCount(0, str2.length()));
	}
}
