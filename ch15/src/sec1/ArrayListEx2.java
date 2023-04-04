package sec1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// stArr은 Student의 집합체(목록/list)이므로 개별 요소 객체는 Student로부터 만들어진 객체이어야 함
		ArrayList<Student> stArr = new ArrayList<>();
		
		// 개별 요소인 Student의 객체를 생성하여 각 요소에 해당하는 값을 저장한다.
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("조교행");
		st1.setKor(99);
		st1.setEng(98);
		st1.setMat(92);
		stArr.add(st1);
		// 저장한 각 요소의 값을 stArr에 목록으로 저장한다.
		
		Student st2 = new Student();
		st2.setNo(2);
		st2.setName("TYLER");
		st2.setKor(98);
		st2.setEng(97);
		st2.setMat(91);
		stArr.add(st2);
		
		for(int i=0;i<stArr.size();i++){
			System.out.println(stArr.get(i));
		}
		System.out.println("----------------------------------------------------");
		for(Student s1 : stArr){
			System.out.println(s1.toString());
		}

		System.out.println("----------------------------------------------------");
		
		Iterator iter = stArr.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
}