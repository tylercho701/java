package sec1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for(int i=0; i<=3; i++){
			try {
				arr[i] = i;
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				// e.printStackTrace();		index 범위 초과에 대한 exception 정보를 표기하지 않고, for문이 멈출 수 있도록 break;로 마무리
				break;
			}
		}
	}
}