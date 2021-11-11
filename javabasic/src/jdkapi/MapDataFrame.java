package jdkapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDataFrame {

	public static void main(String[] args) {
		//Map을 이용해서 하나의 행을 표현하면 DTO 클래스가 필요없음
		//여기서 주의할점은 key를 문자열로 작성하기 때문에 key 이름을 정확하게 기억해야 합니다.
		//get을 이용해서 가져온 후 사용할 때 강제 형 변환을 해주어야 합니다.
		List<Map<String, Object>> list = 
				new ArrayList<>();
		
		//1개의 데이터를 생성해서 추가하기
		Map<String, Object> map = new HashMap<>();
		map.put("name", "Java");
		map.put("description", "프로그램을 만들기 위한 언어");
		map.put("days", 15);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Database");
		map.put("description", "데이터를 효율적으로 관리하기 위한 SW");
		map.put("days", 5);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "WebFrontEnd");
		map.put("description", "웹 브라우저에 출력하기 위한 기술");
		map.put("days", 7);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "JavaWeb");
		map.put("description", "Java를 이용해서 Web Server를 만들기 위한 기술");
		map.put("days", 8);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Spring");
		map.put("description", "Java Application을 빠르게 구현할 수 있도록 해주는 프레임워크");
		map.put("days", 15);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Java Web Application Project");
		map.put("description", "그 동안 배운 것들을 이용해서 프로젝트를 진행"); 
		map.put("days", 10);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Python");
		map.put("description", "애플리케이션을 제작하기 위한 프로그래밍 언어"); 
		map.put("days", 10);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "데이터 수집 및 탐색");
		map.put("description", "데이터를 수집하고 확인하는 작업"); 
		map.put("days", 5);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "전처리 및 마이닝");
		map.put("description", "분석하기 좋게 데이터를 가공하고 마이닝"); 
		map.put("days", 5);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "AI");
		map.put("description", "머신러닝, 딥러닝"); 
		map.put("days", 20);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "프로젝트");
		map.put("description", "AI 관련된 서비스 구축"); 
		map.put("days", 20);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Linux");
		map.put("description", "서버 및 클라이언트 용 운영체제"); 
		map.put("days", 0);
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "도커");
		map.put("description", "컨테이너"); 
		map.put("days", 0);
		list.add(map);
		
		//전체 데이터 출력하기
		for(Map<String, Object> temp : list) {
			//Map에 저장된 데이터를 출력할 때는 get으로 꺼내 그대로 사용하면 됩니다.
			System.out.println(temp.get("name") + ":" + 
					temp.get("description"));
		}
		
		System.out.println("=======================");
		//일부분의 데이터 출력하기
		//현재 출력 중인 데이터 번호를 저장할 인덱스 변수 생성
		int i=0;
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//무한 반복문 생성
		while(true) {
			//페이지당 2개씩 출력할 것이라서 +2
			int size = i + 2;
			
			for(; i<size; i=i+1) {
				//데이터의 인덱스가 list의 데이터 개수 와 같아지면 더 이상 읽을 필요 없음
				if(i == list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			
			//무한 반복문 종료
			if(i == list.size()) {
				break;
			}
			//다음 데이터 입력받기
			System.out.println("다음 페이지 데이터는 ENTER를 누르면 보여집니다.");
			sc.nextLine();
		}
		//무한 반복문 종료
		sc.close();
		
		System.out.println("=======================");
		System.out.println("데이터 1개 가져오기");
		System.out.println(list.get(1));
		
		System.out.println("=======================");
		System.out.println("데이터 정렬하기");
		
		//map 안에 있는 name의 오름차순 정렬
		list.sort(new Comparator<Map<String, Object>>(){
			@Override
			public int compare(
				Map<String, Object> o1, Map<String, Object> o2) {
				//이렇게 내부 데이터를 다른 용도로 사용할 때는 형 변환해서 사용
				String front = (String)o1.get("name");
				String back = (String)o2.get("name");
				return front.compareTo(back);
			}
		});
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("name"));
		}
		
	}
}

