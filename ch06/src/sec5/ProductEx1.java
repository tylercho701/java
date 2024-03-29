package sec5;

import dao.Product;

public class ProductEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.name = "텀블러";
		//pro1.pid = "A001";	default 이므로 같은 패키지 내에서만 접근 가능
		pro1.setPid("A001");
		//pro1.style = "CUP";	protected 이므로 상속 관계나 포함 관계일 경우 접근 가능
		pro1.setStyle("CUP");
		//pro1.account = 10;	private 이므로 해당 클래스 내에서만 접근 가능
		pro1.setAccount(10);
		
		/*
		 *public : 클래스, 필드, 생성자, 메소드 - 같은 패키지 뿐만 아니라 다른 패키지에서도 import를 통해 접근 가능
		 protected : 필드, 생성자, 메소드 - 같은 패키지 뿐만 아니라 다른 패키지에서도 클래스 내에서 extends(상속)선언을 통해 접근 가능
		 default : 클래스, 필드, 생성자, 메소드 - 같은 패키지일 경우에만 접근 가능
		 *private : 필드, 생성자, 메소드 - 같은 클래스 내에서만 접근 가능
		 
		 public > protected > default > private
		 
		*/
		
		
	}
}