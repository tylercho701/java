package sec1;

public class Example7 {

	public static void main(String[] args) {
		// long : 숫자 입력하면 integer로 인식하기 때문에 int의 표현 범위를 벗어나면 에러남
		// 값 뒤에 'l' 또는 'L'표기하면 long으로 인식함
		
		long a = 123456789000L;
		long b = 365L;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("long 타입 표현 범위");
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		System.out.println("a의 메모리주소 : ");
		System.out.println(System.identityHashCode(a));
	}

}
