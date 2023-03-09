package sec3;

public class Example2 {

	public static void main(String[] args) {
		// 정수, 문자열, 실수 지시자 세부적으로 출력 지시 (제어)
		
		int d = 1234;
		double f = 2345.123456789d;
		String s = "I\'m a boy";
		
		System.out.printf("%d\n", d);	// 그대로 출력
		System.out.printf("%6d\n", d);	// 자릿수 6자리보다 작으면, 해당 숫자를 출력하고, 왼쪽에 공백이 발생.
		System.out.printf("%-6d\n", d);	// 자릿수 6자리보다 작으면, 해당 숫자를 출력하고, 오른쪽에 공백이 발생.
		System.out.printf("%06d\n\n", d);	// 자릿수 6자리보다 작으면, 해당 숫자를 출력하고, 왼쪽에 0으로 채움.
		//System.out.printf("%.2d\n", d);	// 실수일 경우, 소숫점 2자리까지 출력.
		
		System.out.printf("%f\n", f);	// 그대로 출력 (기본 출력으로는 소수점 뒤로 6자리 까지만 출력함)
		System.out.printf("%15f\n", f);	// 소수점 포함 15자리보다 작으면, 해당 실수를 출력하고, 왼쪽에 공백이 발생.
		System.out.printf("%.8f\n", f);	// 소숫점 자리 8자리까지 표기
		System.out.printf("%9.4f\n\n", f);	// 소수점 포함 9자리까지 표기하고, 소수점 뒤로는 4자리까지만 표기
		
		System.out.printf("%s\n", s);	// 그대로 출력
		System.out.printf("%15s\n", s);	// 공백을 포함하여 15자리까지 표기하고, 문자열이 남으면 왼쪽에 공백 발생.
		System.out.printf("%-6s\n", s);	// 설정한 자리수 6자리를 초과했지만 문자열 전체 출력함.
	}
}