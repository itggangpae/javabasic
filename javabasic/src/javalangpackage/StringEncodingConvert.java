package javalangpackage;

import java.io.*;

public class StringEncodingConvert {
	public static void main(String args[]) {
		String str = "대한민국";
		try {
			byte[] by = str.getBytes("MS949");
			System.out.println("str:" + str);
			String msg = new String(by, "UTF-8");
			System.out.println("msg:" + msg);
			byte[] utf16 = { (byte)0xC0, (byte)0xAC, (byte)0xB7, (byte)0x91 };
			System.out.println("UTF-16 에서:" + new String(utf16, "UTF-16"));
			byte[] ms949 = { (byte) 0xBB, (byte) 0xE7, (byte) 0xB6, (byte) 0xFB };
			System.out.println("MS949 에서 :" + new String(ms949, "MS949"));
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩을 지원하지 않습니다.");
		}
	}
}
