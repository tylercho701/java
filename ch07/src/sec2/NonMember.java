package sec2;

public class NonMember extends Customer {
	private String tempId;
	private String tempPw;
	private int orderNum;
	
	public NonMember() {
	}
	
	public NonMember(String name) {
		super(name);
	}
	public NonMember(String name, String tel) {
		super(name, tel);
	}
	public NonMember(String name, String tel, String email) {
		super(name, tel, email);
	}
	public NonMember(String name, String tel, String email, String addr) {
		super(name, tel, email, addr);
	}
	public NonMember(String name, String tel, String email, String addr, int age) {
		super(name, tel, email, addr, age);
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId) {
		super(name, tel, email, addr, age);
		this.tempId = tempId;
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, String tempPw) {
		super(name, tel, email, addr, age);
		this.tempId = tempId;
		this.tempPw = tempPw;
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, String tempPw, int orderNum) {
		super(name, tel, email, addr, age);
		this.tempId = tempId;
		this.tempPw = tempPw;
		this.orderNum = orderNum;
	}
	
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	public String getTempPw() {
		return tempPw;
	}
	public void setTempPw(String tempPw) {
		this.tempPw = tempPw;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}


	@Override
	public void getCustom() {
		System.out.println("비회원 고객님, 감사합니다.");
	}
}
