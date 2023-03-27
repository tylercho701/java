package java07;

public class Product {
	private int pnum;
	private String pname;
	private String std;
	private int amount;
	private String discript;
	private String pic;
	private int inprice;
	private int slprice;
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDiscript() {
		return discript;
	}
	public void setDiscript(String discript) {
		this.discript = discript;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getInprice() {
		return inprice;
	}
	public void setInprice(int inprice) {
		this.inprice = inprice;
	}
	public int getSlprice() {
		return slprice;
	}
	public void setSlprice(int slprice) {
		this.slprice = slprice;
	}
	@Override
	public String toString() {
		return "Product [pnum=" + pnum + ", pname=" + pname + ", std=" + std
				+ ", amount=" + amount + ", discript=" + discript + ", pic="
				+ pic + ", inprice=" + inprice + ", slprice=" + slprice + "]";
	}
}
