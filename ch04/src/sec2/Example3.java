package sec2;

public class Example3 {

	public static void main(String[] args) {
		// 구구단 (2단~9단) - 중첩 for문을 활용
		// 바깥은 줄(세로) , 안은 칸 (가로)
		
		int i, j;
		
		for (i=1; i<=9; i++){
			for (j=2; j<=9; j++){
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
		System.out.println();
		}
		
	}
}