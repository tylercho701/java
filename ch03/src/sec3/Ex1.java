package sec3;

public class Ex1 {

	public static void main(String[] args) {
		// 연습 문제
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudents = pencils / students;
		System.out.println(pencilsPerStudents);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}