package sec2;

public class Home {
	private RemoteControl rc = new RemoteControl(){

		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		} 
	};
	
	public void use1(){
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2(){
		RemoteControl rc2 = new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("에어컨의 전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨의 전원을 끕니다.");
			}
		};
		rc2.turnOn();
		rc2.turnOff();
	}
	
	public void use3(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	};
}