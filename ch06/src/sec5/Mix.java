package sec5;

public class Mix {
	public int field1;
	protected int field2;
	int field3;
	private int field4;
	
	public void field1(){
		System.out.println("public field1");
	}
	protected void field2(){
		System.out.println("protected field2");
	}
	void field3(){
		System.out.println("default field3");
	}
	private void field4(){
		System.out.println("private field4");
	}
}