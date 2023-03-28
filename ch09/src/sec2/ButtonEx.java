package sec2;

public class ButtonEx {
	public static void main(String[] args){
		// OK 버튼 객체 생성
		Button btok = new Button();
		
		// OK 버튼 클릭 이벤트를 처리할 clicklistener 구현 클래스 (로컬)
		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		
		// OK 버튼 객체에 clicklistener 구현 객체 주입
		btok.setClickListener(new OkListener());
		
		
		// OK 버튼 클릭하기
		btok.click();
		
		
		// cancel 버튼 객체 생성
		Button btcl = new Button();
		
		// cancel 버튼 클릭 이벤트를 처리할 clicklistener 구현 클래스 (로컬)
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		// cancel 버튼 객체에 clicklistener 구현 객체 주입
		btcl.setClickListener(new CancelListener());
		
		// cancel 버튼 클릭
		btcl.click();
	}
}