package sec2;

public class Example6 {

	public static void main(String[] args) {
		// 10진수를 n진수로 변환
		int a = 967;
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(a));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(a));
		System.out.println("16진수로 변환 : "+Integer.toHexString(a));
		
		int b = 0b1111000111;
		int c = 01707;
		int d = 0x3c7;
		
		System.out.println("b를 10진수로 : "+b);
		System.out.println("c를 10진수로 : "+c);
		System.out.println("d를 10진수로 : "+d);
		
	}

}
