package array;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String [] args) {
		int[] array = {1, 1, 2, 3, 5, 8, 13};
		int[] newArray1 = new int[array.length + 3];
		System.arraycopy(array, 0, newArray1, 0, array.length); //자바 5.0까지의 배열 복사 방법
		int[] newArray2 = Arrays.copyOf(array, array.length + 3); //자바 6.0 이후의 배열 복사 방법
		newArray2[7] = 21;
		newArray2[8] = 34;
		newArray2[9] = 55;
		for(int i=0; i<newArray2.length; i++) {
			System.out.printf("%d\t", newArray2[i]);
		}
		//newArray2[10] = 89; // ArrayIndexOutOfBoundException 발생
	}
}