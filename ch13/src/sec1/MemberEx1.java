package sec1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member<String, Integer> m1 = new Member<>();
		
		m1.setId("ckh");
		m1.setNo(1004);
		
		System.out.println(m1.getId()+", "+m1.getNo());
		
		Member<Integer, String> m2 = new Member<>();
		
		m2.setId(1234);
		m2.setNo("ccc");
		
		System.out.println(m2.getId()+", "+m2.getNo());
	}
}