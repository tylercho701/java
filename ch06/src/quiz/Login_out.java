package quiz;

public class Login_out {

	public static void main(String[] args) {
		MemberService ms1 = new MemberService();
		
		boolean result = ms1.login("hong", "12345");
		if(result){
			System.out.println("로그인 되었습니다.");
			ms1.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}