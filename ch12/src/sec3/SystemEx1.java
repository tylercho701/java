package sec3;

import java.util.Scanner;

public class SystemEx1 {

	public static void main(String[] args) {
		// out
		System.out.println("system으로 내용 출력");
		
		// err
		try {
			int val = Integer.parseInt("a1004");
			System.err.println(val);
		} catch(Exception e) {
			System.err.println("에러");
			System.err.println(e.getMessage());
		}
		
		// in
		System.out.println("내용 입력 (0 or 1 : ");
		Scanner sc = new Scanner(System.in);
		
		// exit
		String msg = sc.nextLine();
		if(msg.equals("1")){
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		
		// currentTimeMillise() : 시스템의 현재 시간을 밀리초로 반환
		System.out.println("현재 시간(밀리초) : "+System.currentTimeMillis());
		
		// nanoTime() : 현재 시간을 나노초로 반환
		System.out.println("현재 시간(나노초 : "+System.nanoTime());
		
		// getProperty() : 시스템의 운영체제의 사용자 정보 반환
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.dir"));
		
	}
}