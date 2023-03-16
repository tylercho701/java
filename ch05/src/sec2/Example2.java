package sec2;

public class Example2 {

	public static void main(String[] args) {
		// 문자열의 일부 변경 - 변수명.replace
		
		// 문자열 잘라내기 - 변수명.substring(startIndex, endIndex);
		
		// 특정 문자의 위치(인덱스) 찾기 - 변수명.indexOf("문자")
		
		// 문자열 분리
		String dates = "2023-03-16";
		String descs = "이사-가는-날";
		
		// 문자열의 배열로 분리 - 문자열에서 특정 구분자(token)를 기준으로 또 다른 여러 문자열로 분리
		String[] date = dates.split("-");
		String[] desc = descs.split("-");
		
		// Array.length : 문자열 배열의 길이
		
		System.out.println(date);
		for(int i=0; i<date.length; i++){
			System.out.print(date[i]);
		}
		System.out.println();
		
		System.out.println(desc);
		for(int i=0; i<desc.length; i++){
			System.out.print(desc[i]);
		}
		System.out.println();
	}
}