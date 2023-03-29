package sec2;

public class ExceptionThrows {

	public static void main(String[] args) throws ClassNotFoundException {
		// throw 구문으로 java에게 예외 처리를 떠넘기기 할 수 있음
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}