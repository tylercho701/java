package sec2;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire(){
		@Override
		public void roll() {
			System.out.println("이름 없는 tire2 굴러감");
		}
	};
	
	public void run1(){
		tire1.roll();
		tire2.roll();
	}
	
	public void run3(){
		Tire tire3 = new Tire(){
			@Override
			public void roll() {
				System.out.println("익명의 이름 없는 지역 변수 tire3 굴러감");
			}
		};
		tire3.roll();
	}
	
	public void run4(Tire tire){
		tire.roll();	
	}
}