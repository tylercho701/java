package sec1;

public class GenericEx1 {

	public static void main(String[] args) {
		Generic<User> u1 = new Generic<>();
		// uname, uno, uid
		User user = new User();
		user.setUid("ckh");
		user.setUname("조교행");
		user.setUno(1234);
		
		u1.obj = user;
		
		System.out.println(u1.obj.toString());
		
		
		Generic<Administrator> a1 = new Generic<>();
		// grade, ano, name
		Administrator admin = new Administrator();
		admin.setAno("tyler");
		admin.setGrade("SU");
		admin.setName("TYLER");
		
		a1.obj = admin;
		
		System.out.println(a1.obj.toString());
		
	}
}