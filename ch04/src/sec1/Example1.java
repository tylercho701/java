package sec1;

public class Example1 {
	
	public static void main(String[] args) {
		// 제어문 : 조건분기문, 반복문, 기타제어문으로 구성 / 프로그램 실행의 흐름을 제어
		// 조건분기문 : 입력되어지는 데이터의 조건 만족 여부에 따라 실행 내용을 달리 하도록 하는 문장
		// if~문, switch~문
		// if문 : 조건이 하나일때는 '{}' 없이 / 실행할 문장이 2줄 이상일때는 '{}'로 조건 내용을 블록처리함;
		// 1. 초기화가 되어 있는 경우 else 사용 X / 2. 최초 선언 시 초기화 값이 'null'인 경우 else 로 보완;
		
		// 삼항연산자
		int score = 90;
		String res = (score >=90) ? "우수" : "보통";
		
		// 한 줄 if문
		String res2 = "보통";
		if (score >= 90) res2 = "우수";
		
		// 두 줄 이상 if문 1
		String res3 = "보통";
		if (score >= 90){
			res3 = "우수";
		}
		
		// 두 줄 이상 if문 2
	}
}