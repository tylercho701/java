package quiz;

public class Login_out {

	public static void main(String[] args) {
		String id = "hong";
		String password = "12345";

		MemberService ms1 = new MemberService(id, password);

		boolean result = ms1.login(id, password);
		if(result){
			System.out.println("로그인 되었습니다.");
			ms1.logout(id);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}