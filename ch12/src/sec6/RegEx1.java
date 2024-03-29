package sec6;

import java.util.regex.Pattern;

public class RegEx1 {
	
	public static void main(String[] args){
		String pattern = "^[0-9]*$";
		String val = "a123456789";
		
		boolean regex = Pattern.matches(pattern, val);
		System.out.println("정규식 표현으로 유효성 검사 : "+regex);
		
		String name = "조교행";
		String tel = "010-2345-6789";
		String mail = "kyohaeng7@naver.com";
		
		boolean name_check = Pattern.matches("^[가-힣]*$", name);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
		boolean mail_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", mail);
		
		System.out.println("이름 : " + name_check);
		System.out.println("전화번호 : " + tel_check);
		System.out.println("메일 : " + mail_check);
	}
}