package practice.chap04;

public class MultipleOfFive {

	public static void main(String[] args) {
		  int sum = 0 ;
	        
	      //for문을 이용하여 반복 합계 연산 
	      for(int i=5; i<=100; i=i+5) {
	    	  sum = sum + i;
	      }
	        
	      System.out.println("5의 배수의 합계는 "+sum);
	}
}
