package sec2;

public class Others implements Mix{

	@Override
	public String method3() {
		return "게스트의 메소드3";
	}

	@Override
	public int method4() {
		return 4;
	}

	@Override
	public String method1() {
		return "유저의 메소드1";
	}

	@Override
	public int method2() {
		return 2;
	}

	@Override
	public String method5() {
		return "믹스의 메소드5";
	}

	@Override
	public int method6() {
		return 6;
	}
}