package javalangpackage;

import java.util.Date;

public class DynamicInstance {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.util.Date");
		Date obj = (Date)clazz.getDeclaredConstructor().newInstance();
		System.out.println(obj);
	}
}

