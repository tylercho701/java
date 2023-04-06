package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		// Queue는 인터페이스 이기 때문에 생성자 함수를 LinkedList로 써줘야 함
		Queue<Integer> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		
		q1.add(90);
		q1.add(70);
		q1.add(100);
		q1.add(80);
		q1.add(75);
		
		System.out.println(q1.toString());
		System.out.println(q1.peek());			// queue 의 첫번째 값을 반환
		System.out.println(q1.poll());			// queue 의 첫번째 값을 반환 후 제거, 비어있다면 null을 반환
		
		q1.remove();								// queue 의 첫번째 값을 제거
		System.out.println(q1.toString());
		
		for(Integer i : q1){
			
			System.out.println("요소의 값 : "+i);
		}
		q1.clear();
		
		
	}
}