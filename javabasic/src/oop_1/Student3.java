package oop_1;

public class Student3 {
	private static String school;
	private static String teacher;
	static{
		school = "삼학국민학교";
		System.out.println("클래스가 메모리에 로드되었습니다.");
		System.out.println("학교 이름은 " + school + "입니다");
		System.out.println("저의 첫번째 선생님 성함은 " + teacher + " 선생님 입니다");
	}
	
	static{
		teacher = "오양록";
		System.out.println("저의 첫번째 선생님 성함은 " + teacher + " 선생님 입니다");
	}
}