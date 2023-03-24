package sec1;

public class AbstractEx1 {
	public static void main(String[] args) {
		//추상 클래스는 추상화되어 있어 구현할 
		Abstract1 ab1 = new Abstract1() {
		
		@Override
		public String method1(){
			return "익명 클래스의 메소드1";
			}
		
		};
		ab1.method1();
		method2();
	}
	
	static void method2(){						// 익명의 클래스를 만들기 위한 메소드
		Abstract1 ab1 = new Abstract1(){
			@Override
			public String method1(){
				return "익명 클래스의 메소드1";
			}
		};
		ab1.method1();
	}

	
	static void method3 (Abstract1 ab1){		// 익명의 클래스를 매개 변수로 대입하기 위한 메소드
		ab1.method1();
	}
	// 추상 클래스를 이용하여 객체를 생성하기 위해서는 추상 메소드에 대한 구현 내용을 기술하면 만들 수 있다.
}