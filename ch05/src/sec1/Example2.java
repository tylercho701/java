package sec1;

public class Example2 {

	public static void main(String[] args) {
		// 배열 선언
		int[] i_prac1;// 타입[] 배열명		몇 개의 인덱스를 가지고 있는지 파악할 수 없어 초기화 해줘야 함;
		int pract_2[];// 타입 배열명[]
		
		int[] io_arr = new int[9];			// 원소의 개수가 특정되면, 주소 배정이 이루어짐(=자동 초기화 됨)
		String st_arr[] = new String[6];	// 원소의 개수가 특정되면, 주소 배정이 이루어짐(=자동 초기화 됨)
		
		
		
		
		int[] prac_3 = {1, 35, 60, 92};		// 원소의 수량이 특정되므로, 주소 배정이 이루어짐(=초기화 됨)
		for (int i=0; i<prac_3.length;i++){
			System.out.println(prac_3[i]);
		}
		
		
		int arr2[] = {5, 6, 3, 2};
		// 추가 향상된 for문
		for(int dt : arr2){
			System.out.print(dt+"\t");
		}
	}
}