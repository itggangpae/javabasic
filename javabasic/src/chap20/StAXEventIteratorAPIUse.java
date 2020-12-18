package chap20;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class StAXEventIteratorAPIUse {

	public static void main(String[] args) {
		try {
			//다운로드 받을 주소 생성
			//한글이 포함된 경우는 한글은 인코딩해야 합니다.
			//URLEncoder.encode(한글, "utf8")
			String addr = 
					"http://www.hani.co.kr/rss/";
			//URL로 생성
			URL url = new URL(addr);
			//연결하기
			HttpURLConnection con = 
					(HttpURLConnection)
					url.openConnection();
			con.setConnectTimeout(30000);


			XMLInputFactory factory = XMLInputFactory.newInstance(); 
			XMLStreamReader reader = factory.createXMLStreamReader(con.getInputStream());
			while (reader.hasNext()) { 
				reader.next();
				int eventType = reader.getEventType();
				if (eventType == XMLStreamConstants.START_ELEMENT) { 
					System.out.println("Name: " + reader.getName());
					int count = reader.getAttributeCount(); 
					if (count != 0) {
						System.out.println("Attribute:");
						for (int index = 0; index < count; index++) {
							System.out.println(" Name: "
									+ reader.getAttributeName(index)); 
							System.out.println(" Value: "
									+ reader.getAttributeValue(index));
						} 
					}
				} else if (eventType == XMLStreamConstants.CHARACTERS) { 
					String text = reader.getText().trim();
					if (!text.isEmpty()) {
						System.out.println("Text: " + text);
						System.out.println(); 
					}
				} 
			}
		}catch(Exception e) {
			System.out.printf("XML 파싱 예외:%s\n",
					e.getMessage());
		}

	}

}
