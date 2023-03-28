package sec2;

public class CarEx1 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		
		car.run3();
		
		car.run4(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명의 이름 없는 새로 선언된 매개 변수 tire4 굴러감");
			}
		});
	}
}