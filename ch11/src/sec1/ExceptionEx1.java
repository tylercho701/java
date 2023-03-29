package sec1;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String i = null;
		try { System.out.println(i.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}