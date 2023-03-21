package dao;

public class MixEx2 {

	public static void main(String[] args) {
		Mix2 m1 = new Mix2();
		m1.field1 = 10;
		m1.field2 = 20;
		//m1.field3 = 30;		default이므로 다른 패키지에서 접근 X
		//m1.field4 = 40;		private이므로 다른 클래스에서 접근 X
		
		m1.field1();
		m1.field2();
		//m1.field3();			default이므로 다른 패키지에서 접근 X
		//m1.field4();			private이므로 다른 클래스에서 접근 X
	}
}