package sec1;

public class Example3 {

	public static void main(String[] args) {
		// 포인터
		int[] arr1;
		int[] arr2;
		int[] arr3;
		int[] arr4;
		
		arr1 = new int[] {1, 3, 6, 3};
		arr2 = new int[] {1, 3, 6, 3};
		arr3 = arr2;			//얕은 복제는 실제 데이터의 주소만 전달하여 같은 주소를 가리키도록 설정;
		
		System.out.println("arr1 = "+arr1);
		System.out.println("arr2 = "+arr2);
		System.out.println("arr3 = "+arr3);		// 데이터가 아닌 포인터만 출력
		
		System.out.println();
		for(int data : arr1){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr2){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr3){
			System.out.print(data+"\t");
		}
		
		System.out.println();
		System.out.println("arr1 == arr2 : "+(arr1==arr2));
		System.out.println("arr2 == arr3 : "+(arr2==arr3));
		
		System.out.println();
		System.out.println("arr1 != arr2 : "+(arr1!=arr2));
		System.out.println("arr2 != arr3 : "+(arr2!=arr3));
	}
}