package practice.chap04;

public class Pattern {

	public static void main(String[] args) {
		/*
		int cnt = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%4d", cnt);
				cnt = cnt + 1;
			}
			System.out.printf("\n");
		}
		*/
		
		for(int i=1; i<=25; i++) {
			System.out.printf("%4d", i);
			if(i%5 == 0) {
				System.out.printf("\n");
			}
		}
		
	}
}
