package oop_1;

public class GC {
	//메모리 정리가 발생할 때 호출되는 메소드
	public void finalize(){
		System.out.println("메모리 정리");
	}
	public static void main(String[] args) {
		GC obj = new GC();
		System.out.println(obj);
		obj = null;
		System.gc();
	}
}