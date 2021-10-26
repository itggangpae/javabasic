package javalangpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringEncoding {

	public static void main(String[] args) {
		String str = "대한민국";
		try {
			System.out.print("UTF-8 : "); 
			byte[] utf8;
			utf8 = str.getBytes("UTF-8"); 
			for (byte b : utf8) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("UTF-16 : ");
			byte[] utf16 = str.getBytes("UTF-16"); 
			for (byte b : utf16) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("UTF-32 : ");
			byte[] utf32 = str.getBytes(Charset.forName("UTF-32")); 
			for (byte b : utf32) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("MS949 : ");
			byte[] ms949 = str.getBytes(Charset.forName("MS949")); 
			for (byte b : ms949) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩을 지원하지 않습니다.");
		}
	}
}
