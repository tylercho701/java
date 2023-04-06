package sec4;

public class StringEx2 {

	public static void main(String[] args) {
		String data1 = "조교행";
		String data2 = new StringBuilder().append("tyler").toString();
		System.out.println(data1);
		System.out.println(data2);
		data1 = new StringBuilder().append("whrygod").toString();
		System.out.println(data1);
		
		String sb = "프로그래밍데이터";
		StringBuilder sb1 = new StringBuilder(sb);
		System.out.println(sb1);
		
		sb1.insert(0,"웹");
		System.out.println(sb1);
		
		sb1.delete(6, 9);
		System.out.println(sb1);
		
		sb1.append("자바");
		
		System.out.println("0~3번 배열 추출 : "+sb.substring(0, 3));
		
		System.out.println(sb1);
	}
}