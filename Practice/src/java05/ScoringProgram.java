package java05;

import java.util.Scanner;

public class ScoringProgram {

	public static void main(String[] args) {
		boolean sw = true;
		
		int studNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		while(sw) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.SCORE | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();
			 
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				studNum = sc.nextInt();
				scores = new int[studNum];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i= 0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(selectNo == 5) {
				sw = false;
			}
		}
		System.out.println("성적 처리 종료");
	}
}