package sec2;

public class Example2 {

	public static void main(String[] args) {
		// 자동 형변환 : 작은 -> 큰
		byte a = 10;
		short b = a;
		int c = b;
		float d = c;
		long e = (long) d;		//소수점 이하가 있는 실수는 정수로 형변환 시 소수점 이하 데이터가 유실될 수 있기 때문에 auto casting이 안됨 (강제 형변환 필요)
		double f = e;
		// 강제 형변환은 형변환 연산자로 함
	}

}
