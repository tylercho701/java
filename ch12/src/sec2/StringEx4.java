package sec2;

public class StringEx4 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("조교행");
		sbf.insert(0,"일산");
		System.out.println(sbf.toString());
		sbf.delete(2, 5);
		System.out.println(sbf.toString());
		sbf.substring(0, 1);
		System.out.println(sbf.toString());
	}
}