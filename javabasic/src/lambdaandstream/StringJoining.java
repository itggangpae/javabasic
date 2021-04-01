package lambdaandstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("대한민국", "일본", "중국", "네덜란드", "뉴질랜드", "호주");
		String joined = list.stream() .filter(p -> p.length() > 3)
		.collect(Collectors.joining(",")); System.out.println(joined);

	}
}
