package sec2;

public class Example2 {

	public static void main(String[] args) {
		// 바깥의 for문은 안의 for문이 모두 실행된 다음 카운트 변수가 증가;
		// 안의 for문은 바깥의 for문이 한번 카운트 증가할 때 마다 매 번 반복 실행;
		// 순차적 실행과 반복 실행; (배열, 이중 for문)
		
		int i;
		int j;
		
		for (i=1; i<=4; i++){
			for (j=1; j<=5-i; j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}