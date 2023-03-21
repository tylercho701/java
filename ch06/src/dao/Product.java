package dao;

public class Product {
	public String name;			// public - 상품명
	String pid;					// default - 상품 코드	default는 같은 패키지에서만 사용 가능
	protected String style;		// protected - 종류	protected는 상속 관계나 포함 관계일 경우에만 접근 가능
	private int account;		// private - 상품 수량	private는 해당 클래스 내에서만 사용 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	
}