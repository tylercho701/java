package sec1;

public class Engine {
	String fuel = "gasolin";
	int cc = 3498;
	int count = 4;
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getcount() {
		return count;
	}
	public void setcount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + ", cc=" + cc + ", count=" + count + "]";
	}
	
	

}