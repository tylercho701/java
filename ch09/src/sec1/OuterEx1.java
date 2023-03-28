package sec1;

public class OuterEx1 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner1 in = out.new Inner1();
	}
}