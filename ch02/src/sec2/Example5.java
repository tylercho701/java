package sec2;

public class Example5 {

	public static void main(String[] args) {
		// 문자열이 논리값일때
		String a = "true";
		String b = "false";
		
		
		System.out.println("a="+a);
		System.out.println(Boolean.parseBoolean(a));
	}

}
