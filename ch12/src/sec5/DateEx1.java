package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		// db에서는 날짜 데이터인데, 처리하는 자바 구문의 필드는 날짜로 받아왔다.
		// 이러한 경우 문자열(String)으로 변환해야 원하는 날자 표시 형식으로 변경 가능
		// JAVA 8 까지는 그냥 사용, 11부터는 String으로 변경해서 사용해야 함
		
		System.out.println("오늘 날짜 (system format) : "+today);
		
		//simpleDateFormat 클래스로 문자열의 특정 날자 표시 형식을 만들어 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String y = sdf.format(today);
		
		System.out.println("오늘 날짜 (modified format) : "+y);
		
	}
}