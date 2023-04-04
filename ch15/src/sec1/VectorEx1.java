package sec1;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		List<Integer> li = new Vector<>();
		li.add(99);
		li.add(97);
		li.add(96);
		
		for(int i=0; i<li.size(); i++){
			System.out.print(li.get(i)+", ");
		}
		System.out.println("\n");
		
		for(Integer i : li){
			System.out.println(i);
		}
		
		// Iterator를 활용한 요소 분리와 while 반복문
		Iterator iter = li.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}