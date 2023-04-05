package sec1;

import java.util.ArrayList;
import java.util.Arrays;

public class CastingListEx2 {

	public static void main(String[] args) {
		String[] arr1 = {"1", "2", "3", "4"};
		for(String a : arr1){
			System.out.println(a);
		}
		System.out.println();
		
		ArrayList<String> arrayList1 = new ArrayList<>();
		for(String a : arr1){
			arrayList1.add(a);
		}
		System.out.println(arrayList1.toString());
		System.out.println("--------------------------------------");
		
		// Arrays 클래스의 asList()를 활용하여 배열 요소를 List로 변환
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println(arrayList2.toString());
	}
}