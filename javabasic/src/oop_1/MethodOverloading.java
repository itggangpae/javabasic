package oop_1;

public class MethodOverloading {
	public static void main(String[] args) {
		Student5 obj1 = new Student5();
		Student5 obj2 = new Student5();
		obj1.set("조이", 80, 60, 85);
		obj2.name = "제니";
		obj2.set(70, 90, 87);
		obj1.disp();
		obj2.disp();
	}
}
