package sec3;

public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("tyler");
		mem1.setPw("1234");
		mem1.setName("tyler");
		mem1.setAge(20);
		mem1.setTel("010-1234-1234");
		mem1.setEmail("kyohaeng7@naver.com");
		
		System.out.println(mem1.toString());
			
	}
}