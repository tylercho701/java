package sec1;

public class Example5 {

	public static void main(String[] args) {
		// Short
		short a = 1234;
		short b = 4321;
		short c = -30000;
		short d = 32000;
		short e = -0;
		byte f = 124;
		Byte g = f;
		Short h = b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		System.out.println(g.getClass().getName()); // z.getClass().getName() - z로 설정한 레퍼런스 타입의 변수값이 지정된 프리머티브 타입의 변수명을 출력함
		System.out.println(h.getClass().getName());
		System.out.println("short ="+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	}
}