package sec5;

public class WrapperEx1 {

	public static void main(String[] args) {
		// references : Wrapper(Byte, Long, Integer, Double, Float, etc), Class
		
		int a = 1;
		Integer b = a;
		int c = b;
		
		float d = 0.1f;
		Float e = d;
		double f = d;
		
		Integer i = 1;
		
		System.out.println("기본형 - 참조형 비교 : "+(a==i));		// 기본형 값 비교
		System.out.println("참조형 - 참조형 비교 : "+(b==i));		// 래퍼형 주소 비교
		System.out.println("참조형 - 참조형 비교 : "+(b.equals(i)));		// 래퍼형 값 비교
		
	}
}