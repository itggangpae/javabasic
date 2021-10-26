package oop_1;

public class Student5 {
	public String name;
	private int kor;
	private int eng;
	private int mat;
	
	//매개변수를 4개 받아서 set 하는 메소드 - void set(String, int, int, int)
	public void set(String n, int n1, int n2, int n3) {
		name = n;
		kor = n1;
		eng = n2;
		mat = n3;
	}
	
	//메소드 오버로딩
	public void set(int n1, int n2, int n3) {
		kor = n1;
		eng = n2;
		mat = n3;
	}

	//내부에서만 사용할 메소드로 kor, mat, eng 의 평균을 구한 후 실수로 리턴하는 메소드
	private double calc() {
		double avg;
		avg = (kor + mat + eng) / 3.0;
		return avg;
	}

	//평균을 호출해서 결과를 콘솔에 출력하는 메소드
	public void disp() {
		System.out.println(name + "의 평균은 " + calc() + "입니다.");
	}
}
