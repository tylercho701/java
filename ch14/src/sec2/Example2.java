package sec2;

public class Example2 {

	public static void main(String[] args) {
		Atm atm = new Atm();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}