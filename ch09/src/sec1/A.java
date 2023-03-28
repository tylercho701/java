package sec1;

public class A {
	int field1;
	String field2;
	class B {				// 인스턴스 멤버 클래스
		
	}
	public class C {		// 인스턴스 멤버 클래스
		
	}
	private class D {		// 인스턴스 멤버 클래스 - private class 이므로 외부 클래스인 a 안에서만 접근 가능
		
	}	
	static class E {		// 정적 멤버 클래스
		
	}
	void f(){
		class G {			// 로컬 클래스
			
		}
	}
}