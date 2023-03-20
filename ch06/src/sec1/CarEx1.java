package sec1;

public class CarEx1 {

	public static void main(String[] args) {
		// 
		Car mycar = new Car();
		System.out.println(mycar.getCompany());
		mycar.setCompany("기아");
		System.out.println(mycar.getCompany());
		
		// mycar의 body1 설정							// 선언한 car클래스의 mycar 변수의 body를 초기화
		Body body1 = new Body();
		System.out.println("기본값 : "+body1.toString());
		body1.setBumper("기본(제조사 자체 제작");
		body1.setFrendar("기본(제조사 자체 제작");
		mycar.setBody(body1);
		
		// mycar의 body2 불러오기							// 초기화한 body1이 mycar에 적용 되었는지 불러와 확인
		Body body2 = new Body();
		body2 = mycar.getBody();
		System.out.println(body2.toString());
		
		// mycar의 engine1 설정
		Engine egn1 = new Engine();
		System.out.println("기본값 : "+egn1.toString());
		egn1.setcount(4);
		egn1.setCc(3500);
		egn1.setFuel("Gasoline");
		mycar.setEngine(egn1);
		
		// mycar의 engine2 불러오기
		Engine egn2 = new Engine();
		egn2 = mycar.getEngine();
		System.out.println(egn2.toString());
		
		
		// mycar의 tire1 설정
		Tire tre1 = new Tire();
		System.out.println("기본값 : "+tre1.toString());
		tre1.setCompany("Continental");
		tre1.setInches(20);
		mycar.setTire(tre1);

		// mycar의 tre2 불러오기
		Tire tre2 = new Tire();
		tre2 = mycar.getTire();
		System.out.println(tre2.toString());
	}
}