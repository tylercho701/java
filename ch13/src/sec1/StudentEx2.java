package sec1;

public class StudentEx2 {

	public static void main(String[] args) {
		Student2<String> st2 = new Student2<String>();
		st2.field2 = "1004";
		
		Student2<Integer> st3 = new Student2<Integer>();
		st3.field2 = 1004;
		
		// Generic(범용) : 하나의 타입만 사용하는게 아니라 여러 타입 아무거나 모두 받아서
		// 				저장하거나 처리할 수 있는 클래스나 인터페이스로 객체 생성 시 원하는 타입을 지정하여 활용
	}
}