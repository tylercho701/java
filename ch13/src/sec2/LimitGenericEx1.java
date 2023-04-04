package sec2;

public class LimitGenericEx1 {

	public static void main(String[] args) {
		LimitGeneric<Integer> a1 = new LimitGeneric<>();
		a1.field1 = 1004;
		
		LimitGeneric<Double> a2 = new LimitGeneric<>();
		a2.field1 = 3.14;
		
		/*
		LimitGeneric<String> a3 = new LimitGeneric<>();
		a3.field1 = "1004";
		*/
		
		// LimitGeneric 클래스에서 Number 클래스로 Generic 제한이 걸려있기 때문에
		// String은 선언 불가
	}
}