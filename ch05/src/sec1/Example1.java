package sec1;

public class Example1 {

	public static void main(String[] args) {
		// 데이터 타입
		// 기본형 (primitive type) : 원시형 / byte ~ boolean;
		// 참조형(reference type) : 열거형(복수형) / 배열형, 열거형, 클래스(DAO, VO), 인터페이스
		
		int arr[] = {1, 70, 80, 90};
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t\n");
		}
		
		int arr1[][] = {{1, 70, 80, 90},{2, 96, 72, 89}};
		System.out.println("번호\t국어\t수학\t영어");
		for (int o=0; o<3; o++){
			for (int j=0; j<3; j++){
						System.out.print(arr1[o][j]+"\n");
				} System.out.println();
		}
	}
}