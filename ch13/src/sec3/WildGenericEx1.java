package sec3;

public class WildGenericEx1 {

	public static void main(String[] args) {
		// Board를 포함하여 Board로부터 상속 받은 DataRoom과 Notice룸은 Generic으로 선언 가능
		// QNA는 Board로부터 상속받지 않았기 때문에 선언 불가
		
		WildGeneric<Board> b1 = new WildGeneric<>();
		WildGeneric<DataRoom> d1 = new WildGeneric<>();
		WildGeneric<Notice> n1 = new WildGeneric<>();
		// WildGeneric<Qna> q1 = new WildGeneric<>();
		
	}
}