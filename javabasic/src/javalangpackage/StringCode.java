package javalangpackage;

import java.nio.charset.Charset;

public class StringCode {

	public static void main(String[] args) {
		try {
			String str = "아담";
			System.out.print("UTF-8 : "); 
			byte[] utf8;
			utf8 = str.getBytes("UTF-8"); 
			for (byte b : utf8) {
				System.out.printf("%02x", b);
			}
			System.out.println();
			System.out.print("UTF-16 : ");
			byte[] utf16 = str.getBytes("UTF-16"); for (byte b : utf16) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("EUC-KR : ");
			byte[] euckr = str.getBytes(Charset.forName("EUC-KR")); 
			for (byte b : euckr) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("MS949 : ");
			byte[] ms949 = str.getBytes(Charset.forName("MS949")); 
			for (byte b : ms949) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
			System.out.print("ISO8859-1 : ");
			byte[] ISO8859 = str.getBytes(Charset.forName("ISO8859-1")); 
			for (byte b : ISO8859) {
				System.out.printf("%02x", b); 
			}
			System.out.println();
		}catch(Exception e) {
		System.out.println("예외 발생:" + e.getLocalizedMessage());
		}

	}

}
