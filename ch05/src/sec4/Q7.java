package sec4;

public class Q7 {

	public static void main(String[] args) {
		// 연습문제.7
		// 석차 / 순위 구하기
		
		int[] array = {1, 5, 3, 8, 2 };
		int max = 0;
		for (int i = 0; i<array.length; i++) {
			if (array[i]>max){
				max = array[i];}
			}
		System.out.println(max);		// 최대값 변수를 우선 선언 후 array.length와 일일이 대조하게 한다.
	}
}