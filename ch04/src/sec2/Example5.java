package sec2;

public class Example5 {

	public static void main(String[] args) {
		// do~while : 적어도 1번 이상의 실행을 보장
		/*
		변수 선언 및 초기화
		do {
			조건식1
			증감식
			조건식2
		}
		while (조건문){
			조건식3
			증감식
			조건식4
		}
		 */
		
		//do~while
		int i = 0;
		int sum = 0;
		
		do {
			i++;
			sum = sum + i;
		}
		while (sum >= 1); {
			i++;
			sum = sum + i + 1;
		}
		System.out.println(sum);
	}
}