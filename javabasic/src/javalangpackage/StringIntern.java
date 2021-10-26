package javalangpackage;

public class StringIntern {

	public static void main(String[] args) {
		String aaa = "BlackPink"; 
		String aa = "Black"; 
		String a = "Pink";
		System.out.println(aaa.equals(aa + a));
		System.out.println(aaa == (aa + a)); 
		System.out.println(aaa == (aa + a).intern());
	}
}
