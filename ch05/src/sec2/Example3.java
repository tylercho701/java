package sec2;

import java.util.Arrays;


public class Example3 {

	public static void main(String[] args) {
		String str1 = "java program";
		char[] c_arr = {'j','a','v','a',' ','p','r','o','g','r','a','m'};

		// 문자열과 문자 배열의 비교 - 변수명.equals(비교)
		// System.out.println(str1 == c_arr);
		System.out.println(str1.equals(c_arr));
		
		System.out.println("\n-------------------------\n");
		
		// 문자배열을 문자열로 변환1
		String str2 = Arrays.toString(c_arr);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		System.out.println("\n-------------------------\n");
		
		// 문자배열을 문자열로 변환2
		// StringBulider : String 또는 char의 배열 요소를 하나의 문자열로 변환;
		StringBuilder strB3 = new StringBuilder();			// 클래스 사용 전 import로 유틸 추가 필요함 "java.util.Arrays"
		for (int i = 0; i<c_arr.length;i++){
			strB3.append(c_arr[i]);
		}
		String str3 = strB3.toString();
		// System.out.println(str1 == strB3);
		System.out.println(str3);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		System.out.println("\n-------------------------\n");
		
		// 문자 배열을 문자열로 변환3
		String str4 = new String(c_arr);
		System.out.println(str4);
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
		System.out.println("\n-------------------------\n");
		
		// 문자열을 문자 배열로 변환 1
		char[] c1 = new char[str1.length()];
		for (int i=0; i<str1.length(); i++){
			c1[i] = str1.charAt(i);
		}
		
		System.out.println("\n-------------------------\n");
		
		// 문자열을 문자 배열로 변환 2
		char[] c2 = str1.toCharArray();

	}
}