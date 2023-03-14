package sec1;

public class Example6 {

	public static void main(String[] args) {
				/*
		 java 12 버전 이상에서 사용 가능
		 '->' (yield)
		*/
		
		float num1 = (float) Math.random(); // 'Math.random'은 0~1의 실수를 임의 추출함
		int num = (int) (Math.random()*6)+1; // 구하고자 하는 범위를 임의 메소드에 곱하고 +1로 값 추출함 -> 실수가 아닌 정수가 나오게 하기 위함
		
		System.out.println("주사위 수 : "+num);
		
		// if문
		if (num == 1 || num == 2){
			System.out.println("하위수");
		} else if (num == 3 || num == 4){
			System.out.println("중위수");
		} else {
			System.out.println("상위수");
		}
		
		// switch문
		switch (num){
			case 1:
			case 2:
				System.out.println("하위수");
				break;
				
			case 3:
			case 4:
				System.out.println("중위수");
				break;
			
			default:
				System.out.println("상위수");
		}
	}
}