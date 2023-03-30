package sec1;

public class Member {
	public String id;
	public String pw;
	
	public Member() { }
	
	public Member(String id) {
		this.id = id;
	}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}