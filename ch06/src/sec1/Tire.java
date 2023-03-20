package sec1;

public class Tire {
	String company = "Continental";
	int inches = 20;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	@Override
	public String toString() {
		return "Tire [company=" + company + ", inches=" + inches + "]";
	}
	
	
}