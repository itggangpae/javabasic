package javalangpackage;

public class CodeString {

	public static void main(String[] args) {
		try {
			byte[] utf16 = { (byte)0xC0, (byte)0xAC, (byte)0xB7, (byte)0x91 };
			System.out.println("UTF-16 에서:" + new String(utf16, "UTF-16"));
			byte[] ms949 = { (byte) 0xBB, (byte) 0xE7, (byte) 0xB6, (byte) 0xFB }; 
			System.out.println("MS949 에서 :" + new String(ms949, "MS949"));
		}catch(Exception e) {
			System.out.println("예외 발생:" + e.getLocalizedMessage());
		}
	}

}
