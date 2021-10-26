package oop_1;

public class ParamMain {

	public static void main(String[] args) {
		ParamClass obj = new ParamClass();
		obj.noParam();
		System.out.println("=====");
		obj.noParam();
		
		System.out.println("=====");
		obj.oneParam(3);
		System.out.println("=====");
		obj.oneParam(2);
		
		System.out.println("=====");
		obj.twoParam(2, "신예은");
		System.out.println("=====");
		obj.twoParam(3, "한소희");

	}

}
