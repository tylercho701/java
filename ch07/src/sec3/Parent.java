package sec3;

public class Parent {
	private String lastName;
	private String firstName;
	private int age;
	
	public Parent(String lastName, int age, String firstName) {
		this.lastName = lastName;
		this.age = age;
		this.firstName = firstName;
	}
	
	
// 자식에게 변화를 허용할 경우
	public void getPrint(){
		System.out.println("자식1");
	}
	
// 자식에게 변화 X
	public final void outPrint(){
		System.out.println("자식2");
	}
}