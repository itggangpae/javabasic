package jdkapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegString {

	public static void main(String[] args) {
		// (1)정규 표현의 패턴을 생성('\\s'는 공백을 나타내는 정규 표현)
		Pattern pattern = Pattern.compile("\\s+");
		// (2)정규 표현의 패턴에 적합한지를 체크하는 문자열 
		String sentence = "This is a pen.";
		// (3)정규 표현을 사용하여 문자열을 분할
		String[] words = pattern.split(sentence);
		
		for (String word : words) { 
			System.out.println(word);
		}

		// (4)정규 표현 처리를 실시하기 위한 클래스를 취득 
		Matcher matcher = pattern.matcher(sentence);
		// (5)정규 표현과 일치한 문자열을 치환 
		System.out.println(matcher.replaceAll(" "));
	}

}
