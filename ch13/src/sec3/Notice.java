package sec3;

public class Notice extends Board {
	private String regdate;

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Notice [regdate=" + regdate + "]";
	}
}