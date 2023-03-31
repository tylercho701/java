package sec6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		SimpleDateFormat sf4 = new SimpleDateFormat("오늘은 E요일 입니다.");
		SimpleDateFormat sf5 = new SimpleDateFormat("오늘은 올해의 D번째 날입니다.");
		SimpleDateFormat sf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		
		String d1 = sf1.format(now);
		String d2 = sf2.format(now);
		String d3 = sf3.format(now);
		String d4 = sf4.format(now);
		String d5 = sf5.format(now);
		String d6 = sf6.format(now);
		
		System.out.println(now);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
	}
}