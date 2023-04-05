package sec1;

import java.util.ArrayList;

public class CastingListEx1 {

	public static void main(String[] args) {
		// ArrayList를 배열로 / 배열을 ArrayList로		
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("1");
		arrayList1.add("2");
		arrayList1.add("3");
		arrayList1.add("4");
		
		System.out.println(arrayList1.toString());
		System.out.println("------------------------------------------");
		
		String[] arr1 = new String[arrayList1.size()];
		int i = 0;
		for (String tmp : arrayList1){
			arr1[i++] = tmp;
		}
		for(String a : arr1){
			System.out.print(a+", ");
		}
		System.out.println();
		System.out.println("******************************************");
		
		String[] arr2 = arrayList1.toArray(new String[arrayList1.size()]);
		for (String a : arr2){
			System.out.print(a+", ");;
		}
		
	}
}