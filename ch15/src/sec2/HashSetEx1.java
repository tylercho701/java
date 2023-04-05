package sec2;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(100);
		set1.add(90);
		set1.add(80);
		set1.add(90);
		set1.add(80);
		
		System.out.println("80이 존재하는가 ?"+set1.contains("80"));
		
		for(Integer s : set1){
			System.out.println(s);
		}
		
		set1.add(70);
		set1.remove(80);
		
		System.out.println();
		
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println(set1.toString());
	}
}