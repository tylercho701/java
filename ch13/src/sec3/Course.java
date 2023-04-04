package sec3;

public class Course {
	
	// 모든 클래스 등록 가능
	public static void regCourse1(Applicant<?> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 course1을 등록함");
	}
	
	// Student 클래스 포함 자식 클래스만 등록 가능
	public static void regCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 course2를 등록함");	
		}
	
	// Worker 클래스 포함 조상 클래스만 등록 가능
	public static void regCourse3(Applicant<? super Worker> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 course3을 등록함");
	}
}