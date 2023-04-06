package sec1;

@FunctionalInterface
interface Myfnc1 {		// 매개 변수와 반환(리턴)이 없는 람다식
	void fnc1();
}

class Person {
	public void action(Myfnc1 f1){
	f1.fnc1();
	}
}

public class LambdaEx1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.action(() -> {
			System.out.println("람다식");
		});
	}
}