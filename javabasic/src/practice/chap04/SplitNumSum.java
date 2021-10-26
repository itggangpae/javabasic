package practice.chap04;

public class SplitNumSum {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int mod = 10000;
		
		while(true) {
			int mok = num / mod;
			sum = sum + mok;
			num = num - (mok * mod);
			mod = mod / 10;
			if(mod == 0) {
				break;
			}
		}
		
		System.out.println("sum:" + sum);

	}

}
