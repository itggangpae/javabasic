package javalangpackage;

public class StringJoin {

	public static void main(String[] args) {
		String [] ar = {"품질은", "양보다", "중요합니다.", "한", "번의", "홈런이", "두", "번의", "더블보다", "낫습니다."};
		StringBuilder message = new StringBuilder(); 
		for (String word : ar) {
			message.append(word);
			message.append(" "); 
		}
		if (message.length() > 0) { 
			message.deleteCharAt(message.length() - 1);
		} 
		System.out.println(message.toString());

		String msg = String.join(" ", ar);
		System.out.println(msg);
	}

}
