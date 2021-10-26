package practice.chap04;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int su = 0;
		for(int i=3; i<=11; i++) {
			su = n1 + n2;
			n2 = n1;
			n1 = su;
		}
		System.out.println("11번째 피보나치 수:" + su);

	}

}
