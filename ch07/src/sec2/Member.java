package sec2;

public class Member extends Customer {
	private String id;
	private String pw;
	
	public Member() {
	}
	public Member(String name) {
		super(name);
	}
	public Member(String name, String tel) {
		super(name, tel);
	}
	public Member(String name, String tel, String email) {
		super(name, tel, email);
	}
	public Member(String name, String tel, String email, String addr) {
		super(name, tel, email, addr);
	}
	public Member(String name, String tel, String email, String addr, int age) {
		super(name, tel, email, addr, age);
	}
	public Member(String name, String tel, String email, String addr, int age, String id) {
		super(name, tel, email, addr, age);
		this.id = id;
	}
	public Member(String name, String tel, String email, String addr, int age, String id, String pw) {
		super(name, tel, email, addr, age);
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public void getCustom() {
		System.out.println("회원 고객님, 감사합니다.");
	}
	
	
}