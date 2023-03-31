package sec5;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year1 = cal.YEAR;				// 년도 숫자
		int month1 = cal.MONTH;				// 0~11
		int month11 = cal.DAY_OF_MONTH;		// 요일번호 (1~7)
		int day1 = cal.DATE;				// 요일번호 (1~7)
		
		int hour1 = cal.HOUR;				// 시 (0~23)
		int hour2 = cal.HOUR_OF_DAY;		// 시 (1~24)
		
		System.out.println(year1);
		System.out.println(month1);
		System.out.println(month11);
		System.out.println(day1);
		System.out.println(hour1);
		System.out.println(hour2);
		
		
		int year2 = cal.get(Calendar.YEAR);				// 년도 숫자
		int month2 = cal.get(Calendar.MONTH)+1;				// 0~11
		int month22 = cal.get(Calendar.DAY_OF_MONTH);		// 요일번호 (1~7)
		int day2 = cal.get(Calendar.DATE);				// 요일번호 (1~7)
		
		int hour3 = cal.get(Calendar.HOUR);				// 시 (0~23)
		int hour4 = cal.get(Calendar.HOUR_OF_DAY);		// 시 (1~24)
		
		int min1 = cal.get(Calendar.MINUTE);
		
		int sec1 = cal.get(Calendar.SECOND);
		
		System.out.println(year2);
		System.out.println(month2);
		System.out.println(month22);
		System.out.println(day2);
		System.out.println(hour3);
		System.out.println(hour4);
		System.out.println(min1);
		System.out.println(sec1);
		System.out.println(Calendar.WEEK_OF_YEAR);
		
		int w = Calendar.WEEK_OF_YEAR+2;
		String week = "";

		switch(w){
		case Calendar.MONDAY:			week = "월요일";	break;
		case Calendar.TUESDAY:			week = "화요일";	break;
		case Calendar.WEDNESDAY:		week = "수요일";	break;
		case Calendar.THURSDAY:			week = "목요일";	break;
		case Calendar.FRIDAY:			week = "금요일";	break;
		case Calendar.SATURDAY:			week = "토요일";	break;
		case Calendar.SUNDAY:			week = "일요일";	break;
		}
		
		System.out.println("today is "+year2+"년 "+month2+"월 "+day2+"일"+hour3+"시 "+min1+"분 "+sec1+"초 ("+week+")");
		
		System.out.println(w);
		System.out.println(Calendar.THURSDAY);
	}
}