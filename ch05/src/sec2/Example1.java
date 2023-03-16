package sec2;

public class Example1 {

	public static void main(String[] args) {
		// 문자열과 문자 배열
		String strl = "java program";
		char[] c_arr = {'j','a','v','a',' ','p','r','o','g','r','a','m'};
		
		//기본 출력
		System.out.println(strl);
		System.out.println(c_arr);

		System.out.println();
		
		//개별 문자 요소 젒근
		for(int i=0; i<strl.length();i++){		// 문자열의 개별 요소 접근
			System.out.print(strl.charAt(i));
		}
		System.out.println();
		
		for(char d : c_arr){					// 문자 배열 요소 접근
			System.out.print(d);
		}
		System.out.println();
	
	
		//문자열인 주민번호의 성별 코드 구하기
		String j = "891212-1059402";
		char jj = j.charAt(7);
		switch(jj){
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("외국인 or 임시");
		}
	}
}