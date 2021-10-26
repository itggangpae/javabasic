package oop_1;

public class ParamClass {
	// 매개변수가 없는 메소드
	public void noParam() {
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("한소희");
		}
	}

	// 매개변수가 1개인 메소드
	public void oneParam(int cnt) {
		for (int i = 0; i < cnt; i = i + 1) {
			System.out.println("한소희");
		}
	}

	// 매개변수가 2개인 메소드
	public void twoParam(int cnt, String name) {
		for (int i = 0; i < cnt; i = i + 1) {
			System.out.println(name);
		}
	}

}
