package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class SevenProperties {

	public static void main(String[] args) {
		Path path = Paths.get("config.properties");
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) 
		{ 
			Properties properties = new Properties(); 
			properties.load(reader);
			String address = properties.getProperty("url"); 
			System.out.println(address);
		} catch (IOException ex) {
			// 예외 처리는 생략 }

		}

	}
}