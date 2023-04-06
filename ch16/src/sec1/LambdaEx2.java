package sec1;

@FunctionalInterface
interface MyFnc2 {		// 매개 변수는 없고, 반환(리턴)이 있는 람다식
	int fnc2();
}
public class LambdaEx2 {
	public LambdaEx2() {
		MyFnc2 f1 = () -> { return 1004; };
		System.out.println(f1.fnc2());
		MyFnc2 f2 = () -> { return 7979; };
		System.out.println(f2.fnc2());
	}
	public static void main(String[] args) {
		new LambdaEx2();

	}
}

/*
1. 선언부
@FunctionalInterface
interface 인터페이스명 {		// 매개 변수는 없고, 반환(리턴)이 있는 람다식
	void 메소드명();
}
2. 구현부
인터페이스명 객체명 = 
*/