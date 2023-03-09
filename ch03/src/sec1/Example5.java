package sec1;

public class Example5 {

	public static void main(String[] args) {
		// 논리 연산자 : &&(and), ||(or), !(not), ^(Xor, 배타적 논리합)
		
		int a = 26;
		int b = 24;
		
		System.out.println("a>25 && b>25 = "+(a>25 && b>25));		//false
		System.out.println("a>25 && b<25 = "+(a>25 && b<25));		//true
		System.out.println("a<25 && b>25 = "+(a<25 && b>25));		//false
		System.out.println("a<25 && b<25 = "+(a<25 && b<25));		//false
		
		System.out.println("------------------------------");
		
		System.out.println("a>25 || b>25 = "+(a>25 || b>25));		//true
		System.out.println("a>25 || b<25 = "+(a>25 || b<25));		//true
		System.out.println("a<25 || b>25 = "+(a<25 || b>25));		//false
		System.out.println("a<25 || b<25 = "+(a>25 || b>25));		//true
		
		System.out.println("------------------------------");
			
		System.out.println("a>25 ^ b>25 = "+(a>25 ^ b>25));		//true
		System.out.println("a>25 ^ b<25 = "+(a>25 ^ b<25));		//false
		System.out.println("a<25 ^ b>25 = "+(a<25 ^ b>25));		//false
		System.out.println("a<25 ^ b<25 = "+(a<25 ^ b<25));		//true
		
		System.out.println("------------------------------");
		
		boolean c = a>25 || b>25;
		
		System.out.println("c="+c);
		System.out.println("!c="+(!c));
		System.out.println("!(!c)="+(!(!c)));		
	}
}