package lambdaandstream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamMapProcessing {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("Black Pinkc"); 
		list.add("Twice"); 
		list.add("Red Velvet"); 
		list.add("GirlsGeneration");
		list.add("WonderGirls");
		list.add("T-ARA");
		Map<Character, List<String>> map = new HashMap<>(); 
		/*
		list.forEach(name -> {
			Character firstCharacter = name.charAt(0);
			List<String> valueList = map.get(firstCharacter);
			// 길이에 대응하는 List가 없으면, 빈 List를 부여한다 
			if(valueList == null){
				valueList = new ArrayList<>();
				map.put(firstCharacter, valueList); 
			}
			valueList.add(name); });
			*/
		
		list.forEach(name -> {
			Character firstCharacter = name.charAt(0);
			// 키가 없을 때만, 빈 List를 값으로 부여한다
			List<String> valueList = map.computeIfAbsent(firstCharacter, key -> new ArrayList<>());
			valueList.add(name);
			});
		
		System.out.println(map);
	}
}
