package sec1;

public class Example2 {
	public static void main(String[] args) {
		// java의 기본 자료형(primitive)_변수는 반드시 추기화(값을 지정해 주는 행위) 되어야 한다.
		// byte, boolean, short, int, long, float, double, char
		// 기본 자료형(primitive) : 하나의 자료만 저정할 수 있음.
		// String

		float g;
		double d;
		
		byte a;
		short c;
		int b;
		long f;
		
		boolean e;
		char h;

		System.out.println("float의 출력 범위 ="+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("double의 출력 범위 ="+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		System.out.println("byte의 출력 범위 ="+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short의 출력 범위 ="+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("integer의 출력 범위 ="+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long의 출력 범위 ="+Long.MIN_VALUE+"~"+Long.MAX_VALUE);



		// 표현 범위 확인
		// Boolean과 Char는 확인 안됨
	}
}