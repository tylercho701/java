package sec1;

@FunctionalInterface
interface MyFnc3 {		// 매개 변수가 있고, 반환(리턴)이 없는 람다식
	void fnc3(int i);
}
public class LambdaEx3 {
	LambdaEx3(){
	MyFnc3 f1 = (a) -> { System.out.println(a+"가 입력 되었습니다.");};
	f1.fnc3(100);
	
	MyFnc3 f2 = (a) -> { System.out.println(a+50+"가 입력 되었습니다.");};
	f2.fnc3(150);
	
	MyFnc3 f3 = (a) -> {
		if(a>=80){
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	};
	f3.fnc3(81);
	};

	public static void main(String[] args) {
		new LambdaEx3();
	}
}