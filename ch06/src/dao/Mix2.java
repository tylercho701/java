package dao;

import sec5.*;

public class Mix2 extends Mix {
	public int field1 = super.field1;
	protected int field2 = super.field2;
	//int field3 = super.field3;			default는 다른 패키지에서 상속을 하더라도 접근 불가
	//private int field4 = super.field4; 	private는 다른 패키지 뿐만 아니라 다른 클래스에서도 접근 불가
	
	public void field1(){
		System.out.println("public mix2_field1");
	}
	protected void field2(){
		System.out.println("protected mix2_field2");
	}
	/*	default는 다른 패키지에서 상속을 하더라도 접근 불가
	void field3(){
		System.out.println("default mix2_field3");
	}
	*/
	
	/*	private는 다른 패키지 뿐만 아니라 다른 클래스에서도 접근 불가
	private void field4(){
		System.out.println("private mix2_field4");
	}
	*/
}