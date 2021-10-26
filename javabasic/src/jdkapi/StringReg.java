package jdkapi;

public class StringReg {

	public static void main(String[] args) {
		String sentence = "This is a pen.";
		// (1)정규 표현과 일치하는지 체크
		System.out.println("(1)"); 
		System.out.println(sentence.matches("Th.* is a .*\\."));
		// (2)정규 표현을 사용한 분할 
		System.out.println("(2)");
		String[] words = sentence.split("\\s+"); 
		for (String word : words) {
			System.out.println(word); }
		// (3)정규 표현을 사용한 치환
		System.out.println("(3)"); 
		System.out.println(sentence.replaceAll("\\s+", " "));

	}

}
