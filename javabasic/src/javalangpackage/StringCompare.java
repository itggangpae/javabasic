package javalangpackage;

public class StringCompare {

	public static void main(String[] args) {
		String aaa = "aaa"; 
		String aa = "aa"; 
		String a = "a";
		//내용을 비교하는 메소드 활용
		System.out.println(aaa.equals(aa + a)); 
		//참조가 같은지 비교
		System.out.println(aaa == (aa + a)); 
		//동일한 객체가 있으면 찾아서 리턴
		System.out.println(aaa == (aa + a).intern());

	}
}
