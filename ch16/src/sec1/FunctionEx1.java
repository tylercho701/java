package sec1;
class MyFunction1 {
	void method1(){									// 매개 변수와 리턴 값이 없는 함수(method)
		System.out.println("method1을 호출합니다.");
	}
}
public class FunctionEx1 {

	public static void main(String[] args) {
		MyFunction1 f1 = new MyFunction1();
		f1.method1();
	}
}