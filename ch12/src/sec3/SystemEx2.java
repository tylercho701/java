package sec3;

import java.io.IOException;

public class SystemEx2 {

	public static void main(String[] args) throws IOException {
		
		int speed = 0;
		int keyCode = 0;
		
		while(true){
			keyCode = System.in.read();
			if(keyCode != 13 && keyCode != 10){
				System.out.println("속도 증가");
				speed++;
			} else if(keyCode == 50){
				System.out.println("속도 감소");
				speed--;
			} else if(keyCode == 51){
				System.out.println("속도 표기 종료");
				break;
			}
		}
		System.out.println("현재 속도 : "+speed);
		System.out.println("프로그램이 종료 되었습니다.");
		
	}
}