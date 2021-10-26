package array;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50, 60};
		int i, j;
		int columnCount = 3;
		int rowCount =ar.length / columnCount;
		
		for (i = 0; i < rowCount; i++) {
			for (j = 0; j < columnCount; j++)
				System.out.print("  " + ar[i*columnCount + j]);
			System.out.println();
		}
		System.out.println();
		
		for(i = 0; i < ar.length; i++) {
			System.out.print("  " + ar[i]);
			if(i % columnCount == 2) {
				System.out.println();
			}
		}
	}
}
