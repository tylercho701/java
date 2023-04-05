package sec3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("guest", "gee");
		map1.put("administration", "adee");
		map1.put("member", "mee");
		System.out.println("HashMap");
		for(Map.Entry<String, String> entry : map1.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("guest", "gee");
		map2.put("administration", "adee");
		map2.put("member", "mee");
		for(Map.Entry<String, String> entry : map2.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		
		map2.put("non-member", "nonee");
		map2.remove("guest");
		boolean b1 = map2.containsValue("gee");
		boolean b2 = map2.containsKey("non-member");
		System.out.println("gee라는 value가 존재하는가 ? "+b1);
		System.out.println("non-member라는 key가 존재하는가 ? "+b2);
	}
}