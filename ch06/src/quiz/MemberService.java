package quiz;

public class MemberService {
	String id;
	String password;
	
public MemberService() {
	}
public boolean login(String id, String password){
	if (id.equals("hong") && password.equals("12345")){
		return true;
	} else {
		return false;
	}
}
public void logout(String id){
	System.out.println(this.id+"님이 로그아웃 되었습니다.");
}
}