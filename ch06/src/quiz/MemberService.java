package quiz;

public class MemberService {
	String id = "hong";
	String password = "12345";
	boolean result = true;
	
public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}
public void login(String id, String password){
	this.result = result;
}
public void logout(String id){
	System.out.println(this.id+"님이 로그아웃 되었습니다.");
}
}