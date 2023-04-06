package sec1;
class MyFunction2 {
	int method2(){								// 매개변수는 없고 반환(return)이 있는 함수(method)
		return 1004;
	}
}
public class FunctionEx2 {

	public static void main(String[] args) {
		MyFunction2 f2 = new MyFunction2();
		int a = f2.method2();
		System.out.println(a);
	}
}