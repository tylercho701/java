package sec2;

public class CustomerEx1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Member m1 = new Member();
		NonMember n1 = new NonMember();
		
		c1.setName("조고객");
		m1.setName("조회원");
		n1.setName("조비회원");
		
		System.out.println(c1.getName());
		c1.getCustom();
		System.out.println(m1.getName());
		m1.getCustom();
		System.out.println(n1.getName());
		n1.getCustom();	
	}
}