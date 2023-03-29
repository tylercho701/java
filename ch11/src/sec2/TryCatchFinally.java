package sec2;

public class TryCatchFinally {

	public static void main(String[] args) {
		// finally 구문은 try 구절의 성공이나 실패와 관계 없이 무조건 실행하는 구문이 필요 할 경우 지정
		try {
		String data = null;
		// data = "조";
		System.out.println(data.toString());
		} catch(Exception e){
			System.out.println("예외 발생");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}