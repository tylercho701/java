package sec2;

public class Example4 {

	public static void main(String[] args) {
		// while
		
		/*
		초기화
		while(조건문){
			조건식1
			증감식
			조건식2
		} 	
		*/

		int i = 0;
		int sum1 = 0, sum2 = 0;
		
		while(i <=100){
			sum1 = sum1 + i;
			i++;				// i의 증감이 조건식의 계산 전이냐 후냐를 두고 결과값에 차이가 있으며
			sum2 = sum2 + i;	// while문의 조건문에 따라서 조건식의 위치를 조정해야 함
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}