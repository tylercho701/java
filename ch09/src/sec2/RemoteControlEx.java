package sec2;

public class RemoteControlEx {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		home.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("냉장고의 전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("냉장고의 전원을 켭니다.");				
			}
		});
	}
}