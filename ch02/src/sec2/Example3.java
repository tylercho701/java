package sec2;

public class Example3 {

	public static void main(String[] args) {
		// 형 변환의 예1
		int kor = 80;
		int eng = 70;
		int mat = 95;
		int tot = kor = eng = mat;
		
		// float avg = tot / 3; -> 정수 대 정수 연산으로, 정수가 반환됨
		float avg = tot / 3.0f; // -> 정수 대 실수 연산으로, 실수 정상 반환됨
		// float avg = (float) tot / 3; -> 정수 대 정수 연산을 강제 형변환 처리함으로, 실수로 정상 반환됨
		// float avg = ((float) tot) / 3; -> 실수(강제 형변환 처리함) 대 정수 연산으로, 실수로 정상 반환됨
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+tot);
		
		System.out.println("평균 : "+avg);
	}

}
