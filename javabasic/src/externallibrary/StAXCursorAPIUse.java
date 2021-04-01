package externallibrary;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAXCursorAPIUse {

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
			XMLEventReader reader = factory.createXMLEventReader(con.getInputStream());
			// 처리 대상의 이벤트를 걸러낼 필터를 설정한다 
			EventFilter filter = new EventFilter() {
				public boolean accept(XMLEvent event) {
					return event.isStartElement() || event.isCharacters();
				} 
			};
			reader = factory.createFilteredReader(reader, filter);
			while (reader.hasNext()) {
				XMLEvent event = reader.nextEvent();
				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement(); 
					System.out.println("Name: " + startElement.getName());
					Iterator<Attribute> attributes = startElement.getAttributes(); 
					if (attributes.hasNext()) {
						System.out.println("Attribute:");
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();

							System.out.println(" Name: " + attribute.getName());
							System.out.println(" Value: " + attribute.getValue()); 
						}
					}
				} else if (event.isCharacters()) {
					Characters characters = event.asCharacters(); 
					String text = characters.getData().trim();
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
