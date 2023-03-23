package sec2;

public class Member implements User {
	//클래스 = 현체 / 인터페이스 = 추상체
	@Override
	public String method1() {
		return "회원";
	}

	@Override
	public int method2() {
		return 2;
	}	
}