package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "수박");
		map1.put(2, "딸기");
		map1.put(3, "바나나");
		
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(){{
			put(1, "바나나");
			put(2, "수박");
			put(3, "딸기");
		}};
		
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.firstEntry());
		System.out.println(map1.firstKey());
	}
}