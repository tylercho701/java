package sec2;

public class Car {
	String company;
	String model;
	int cc;
	String fuel;
	int speed;
	
	public void startUp(){
		System.out.println("시동을 켭니다.");
	}
	public void speedUp(){
		System.out.println("가속합니다.");
		++speed;
	}
	public void speedDown(){
		System.out.println("감속합니다.");
		--speed;
	}
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	}
}