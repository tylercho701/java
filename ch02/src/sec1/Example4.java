package sec1;

public class Example4 {
	public static void main(String[] args) {
		// byte
		byte a = 127;
		byte b = 0;
		byte c = 0b1110000;
		
		System.out.println("c="+c);
		System.out.println("byte="+Byte.BYTES);
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		//Byte.BYTES : 해당 변수의 바이트 값 출력
		//Byte.MIN or MAX_VALUES - 해당 변수값의 최소 or 최대 표현 값 출력
		
		System.out.println("a의 메모리 주소 : "+System.identityHashCode(a));
		System.out.println("b의 메모리 주소 : "+System.identityHashCode(b));
	}
}
