package sec5;

public class MathEx1 {

	public static void main(String[] args) {
		int a = 1004;
		float b = 3.14f;
		long c = 6553600;
		double d = 26500.3425d;
		
		int e = -1004;
		float f = 3.65f;
		long g = -653600;
		double h = 26500.7425d;
		
		System.out.println("지수상수 : "+Math.E);
		System.out.println("원주율 : "+Math.PI);
		System.out.println("절대값 : a = "+Math.abs(a)+", b = "+Math.abs(b));
		System.out.println("올림값 : b = "+Math.ceil(b)+", d = "+Math.ceil(d));
		System.out.println("내림값 : b = "+Math.floor(b)+", d = "+Math.floor(d));
		System.out.println("반올림값 : b = "+Math.round(b)+", d = "+Math.round(d));
		
		System.out.println("제곱값 : a = "+Math.pow(a, 2));
		System.out.println("제곱근 : a = "+Math.sqrt(a));
	}
}