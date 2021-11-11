package jdkapi;

import java.util.ArrayList;
public class TestArrayList {
	public static void main(String args[]) {
		ArrayList<String> sm = new ArrayList<String>();
		sm.add("SES");
		sm.add("소녀시대");
		sm.add("레드벨벳");

		System.out.println("sm의 크기" + sm.size()); // 결과 : al의 크기3
		sm.add("에스파");
		for (int a = 0; a < sm.size(); a++) {
			System.out.println(sm.get(a));
		}
		
		System.out.println("================");
		System.out.println("sm의 크기" + sm.size()); // 결과 : al의 크기4
		sm.remove(1);
		
		System.out.println("sm의 크기 " + sm.size()); // 결과 : al의 크기 3
		for (int a = 0; a < sm.size(); a++) {
			System.out.println(sm.get(a));
		}
	}
}

