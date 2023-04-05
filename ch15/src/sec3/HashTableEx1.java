package sec3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableEx1 {

	public static void main(String[] args) {
		Map<String, String> table1 = new Hashtable<String, String>();
		table1.put("bno", "1");
		table1.put("title", "제목");
		table1.put("content", "내용입니다.");
		table1.put("author", "관리자");
		
		// Entry를 사용한 요소 접근
		for(Entry<String, String> entry : table1.entrySet()){
			System.out.println("[key] : "+entry.getKey()+" [value] : "+entry.getValue());
		}
		
		System.out.println("-----------------------------");
		
		Map<Integer, String> table2 = new Hashtable<>();
		table2.put(0, "zero");
		table2.put(1, "one");
		table2.put(2, "two");
		table2.put(3, "three");
		
		// keySet()을 이용한 요소 접근
		for(Integer i : table2.keySet()){
			System.out.println("[key] : "+ i +" [value] : "+table2.get(i));
		}
		System.out.println();
		for (int i=0;i<table2.size();i++){
			System.out.println("[key] : "+ i +" [value] : "+table2.get(i));
		}
	}
}