package lambdaandstream;

import java.util.ArrayList;
import java.util.List;

public class StreamListProcessing {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("BlackPink"); 
		list.add("Twice"); 
		list.add("RedVelvet");
		list.removeIf(s->s.length() <= 5); 
		list.replaceAll(s->s.toUpperCase());
		list.forEach(System.out::println);
	}
}
