package array;

public class SelectionSort {
	public static void main(String[] args) {
		int test[] = { 20, 30, 40, 50, 10 };
		int i, j, temp;
		int cnt = test.length;
		System.out.print("정렬 전\t");
		for (i = 0; i < cnt; i++) {
			System.out.print(test[i] + "\t");
		}
		System.out.print("\n");
		for (i = 0; i < cnt-1; i++) {
			for (j = i + 1; j < cnt; j++) {
				if (test[i] > test[j]) {
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
			System.out.print((i+1)+"pass\t");
			for(int k = 0; k < cnt; k++) {
				System.out.print(test[k] + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.print("정렬 후\t");
		for (i = 0; i < cnt; i++) {
			System.out.print(test[i] + "\t");
		}
	}
}

