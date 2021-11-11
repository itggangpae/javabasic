package jdkapi;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays2 {

	public static void main(String[] args) {
		Integer [] ar = {20, 40, 30, 50, 10};
		//정수의 오름차순 정렬
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

		//정수의 내림차순 정렬
		Arrays.sort(ar, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(ar));

		Double [] br = {20.8, 40.3, 30.0, 50.2, 10.7};
		//실수의 내림차순 정렬
		Arrays.sort(br, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				if(o1 > o2) {
					return -1;
				}else if(o1 == o2) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		System.out.println(Arrays.toString(br));

		String [] cr = {"Java", "Python", "C++", "C#", "R"};
		//문자열의 내림차순 정렬
		Arrays.sort(cr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(cr));
		
	}
}
