package sec3;

import sec2.*;

public class SuperSubObjectEx1 {
	public static void main(String[] args){
		// 객체 선언
		Customer cus;
		cus = new Customer();
		cus.setName("조고객");
		fnc1(cus);
		
		cus = new Member();
		cus.setName("조회원");
		fnc1(cus);
		
		cus = new NonMember();
		cus.setName("조비회원");
		fnc1(cus);
		
		/*
		 전달 객체는 무조건 부모 객체로 선언해야 한다.
		 상속된 상황에서의 함수 매개객체의 타이은 부모 타입의 매개객체로 설정해야
		 */
		
	}
	public static void fnc1 (Customer cus1) {
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1 (Member cus1) {
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
	public static void fnc1 (NonMember cus1) {
		cus1.getCustom();
		System.out.println(cus1.getName());
	}
}