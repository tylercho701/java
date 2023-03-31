package sec5;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// 로또 복권 랜덤 발생기 : 1~45 아무거나 6개
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++){
			lotto[i] = (int) (Math.random()*45)+1;
			Arrays.sort(lotto);
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		Random ran = new Random();
		for(int i=0; i<6; i++){
			lotto[i] = ran.nextInt(45)+1;
			Arrays.sort(lotto);
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<6; i++){
			lotto[i] = ran.nextInt(45)+1;
			Arrays.sort(lotto);
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		int[] arr = { 6, 8, 11, 14, 36, 42 };
		if(Arrays.equals(arr, lotto)){
			System.out.println("당첨 !");
		} else {
			System.out.println("꽝 .. ");
		}
	}
}