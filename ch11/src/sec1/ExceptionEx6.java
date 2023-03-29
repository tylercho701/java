package sec1;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e){
			System.out.println("해당 클래스를 찾을 수 없습니다..");
		}
	}
}