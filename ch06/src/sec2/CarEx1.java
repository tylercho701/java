package sec2;

public class CarEx1 {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.company = "기아";
		mycar.model = "카니발";
		mycar.cc = 3500;
		mycar.fuel = "Gasolin";
		mycar.speed = 0;
		
		mycar.startUp();
		System.out.println("현재 속도 : "+mycar.speed);
		for(int i = 0; i<80;i++){
		mycar.speedUp();
		System.out.println("현재 속도 : "+mycar.speed);
		}
		for(int i = 0; i<80; i++){
		mycar.speedDown();
		System.out.println("현재 속도 : "+mycar.speed);
		}
		mycar.turnOff();
	}
}