package sec1;

public class Example4 {

	public static void main(String[] args) {
		// 비교 연산자 : ==, !=, >, >=, <, <=
		// 연산 결과는 true or false로 출력됨
		int a = 7;
		int b = 4;
		System.out.println("a==b = "+(a==b));
		System.out.println("a!=b = "+(a!=b));
		System.out.println("a>b = "+(a>b));
		System.out.println("a>=b = "+(a>=b));
		System.out.println("a<b = "+(a<b));
		System.out.println("a<=b = "+(a<=b));
		
		String c = "tyler";
		String d = "tyler";
		
		System.out.println("-------------------");
				
		System.out.println("c==d = "+c==d);			// 자연 비교
		System.out.println("c==d = "+c.equals(d));	// 실제 비교 (문자열 비교 시 'equals' method 사용해야 함 (실무)
	}
}