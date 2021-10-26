package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SixProperties {

	public static void main(String[] args) {
		File file = new File("config.properties");
		InputStream is = null; 
		try {
			is = new FileInputStream(file); 
			Properties properties = new Properties(); 
			properties.load(is);
			String address = properties.getProperty("url");
			System.out.println(address); 
		} 
		catch (IOException e) {
			// 예외 처리는 생략 } finally {
			if (is != null) { 
				try {
					is.close();
				}
				catch (IOException ex) {
					System.err.println(ex); 
				}
			} 
		}
	}
}
