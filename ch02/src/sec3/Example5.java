package sec3;

import java.util.Scanner;
		// java 혹은 javax 로 시작하지 않으면 내가 만든 클래스를 가져올 수 있음
		// 예시 : import sec3.Example3

public class Example5 {

	public static void main(String[] args) {
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름입력 : ");
		String name = scan.nextLine();
		System.out.println("국어 점수 입력 [0-100] :");
		int kor = scan.nextInt();
		System.out.println("영어 점수 입력 [0-100] :");
		int eng = scan.nextInt();
		System.out.println("수학 점수 입력 [0-100] :");
		int mat = scan.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+mat+"\n");
		System.out.println("총점 : "+(kor+eng+mat));
		System.out.println("평균 : "+((kor+eng+mat)/3.0f));
	}
}