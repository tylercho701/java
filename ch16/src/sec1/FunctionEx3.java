package sec1;
class MyFunction3{
	void method3(int x, int y){					// 매개변수는 있고 리턴 값이 없는 메소드
		System.out.println("x+y = "+(x+y));
		System.out.println("x-y = "+(x-y));
		System.out.println("x*y = "+(x*y));
		System.out.println("x/y = "+(x/y));
	}
}
public class FunctionEx3 {
	public static void main(String[] args){
		MyFunction3 f3 = new MyFunction3();
		f3.method3(10, 5);
	}

}
