package sec1;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// ArrayList는 각 특성이 무엇인지 분명하고, 선언 시 개수를 규정할 필요없이 원하는 만큼 요소의 값을 추가/저장(add)
		// 제너릭명<타입> 객체명 = new 제네릭명<>();
		ArrayList<Integer> jum = new ArrayList<>();
		
		jum.add(100);
		jum.add(95);
		jum.add(94);
		jum.add(98);
		
		jum.remove(0);							// .remove(index) : 해당하는 인덱스 번호의  요소 제거
		
		jum.add(0,  100);						// .add(index, element) : 해당하는 인덱스 번호에 요소 추가
		
		System.out.println("98을 가진 요소의 존재 유무 확인 : "+jum.contains(98));				// .contains(element) : 해당 요소의 존재 유무 확인
		System.out.println("98을 가진 요소의 인덱스 위치 확인 : "+jum.indexOf(98)+"\n");		// .indexOf(element) : 해당 요소의 인덱스 위치 확인
		
		for(int i=0; i<jum.size(); i++){		// .size() : 요소의 개수
			int a = jum.get(i);					// .get(index) : 해당하는 인덱스 번호의 요소에 접근
			System.out.println(a);
		}
		
		System.out.println();
		
		for(Integer i : jum){
			System.out.println("점수 : "+i);
		}
	}
}