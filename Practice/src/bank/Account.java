package bank;

public class Account {
	private String anu;
	private String aon;
	private int money;
	public Account(String anu, String aon, int money) {
	 this.anu = anu;
	 this.aon = aon;
	 this.money = money;
	}
	public String getAnu() { return anu; }
	public void setAnu(String anu) { this.anu = anu; }
	public String getAon() { return aon; }
	public void setAon(String aon) { this.aon = aon; }
	public int getMoney() { return money; }
	public void setMoney(int money) { this.money = money; }
}
