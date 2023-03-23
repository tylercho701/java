package sec2;

public interface User {
	// 인터페이스 안의 기본 필드는 상수 (final static)
	
	public String method1();			// 추상 메소드
	public int method2();
	
	default void play(){				// 인터페이스 안에서 구현 메소드를 만들기
		System.out.println("재생합니다.");	// 인터페이스로 직접 호출할 수 없음
	}
	static void play2(){
		System.out.println("호출합니다.");	// 인터페이스로 직접 호출 가능
	}
}