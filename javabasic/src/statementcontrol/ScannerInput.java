package statementcontrol;

import java.util.Scanner;

public class ScannerInput
{
	public static void main(String[] args) {
		System.out.print("임의의 숫자를 입력하세요: ");
		//키보드로부터 입력받는 Scanner 객체를 생성
		Scanner scanner = new Scanner(System.in);
		//구분 문자를 누를 때까지의 내용을 정수로 변환해서 n에 대입
		//실수면 nextFloat 이나 nextDouble 문자열이면 next 로 변환
		int n = scanner.nextInt();	
		System.out.println("입력한 정수:" + n);
		scanner.close();
	}
}