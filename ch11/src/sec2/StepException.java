package sec2;

public class StepException {

	public static void main(String[] args) {
		// 단계적 예외 처리
		
		try {
		String data = null;
		// data = "조";
		System.out.println(data.toString());
		int[] arr = new int[3];
		String data1 = "1004";
		String data2 = "조1004";
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println(val1);
		System.out.println(val2);
		} catch (NullPointerException e1){
			System.out.println("NULL 값이 존재합니다.");
		} catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("배열의 인덱스 범위를 초과한 값이 존재합니다.");
		} catch(NumberFormatException e3){
			System.out.println("숫자가 아닌 데이터가 존재합니다.");
		} catch(ClassCastException e4){
			System.out.println("형변환이 되지 않는 값이 존재합니다.");
		} catch (Exception e5) {
			e5.printStackTrace();
			System.out.println("부적절한 예외값이 존재합니다.");
		}
	}
}