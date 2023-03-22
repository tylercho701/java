package quiz;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
public Member (){
	this("홍길동");
}

public Member(String name) {
	this(name, "hong");
}

public Member(String name, String id) {
	this(name, id, "1234");
}

public Member(String name, String id, String password){
	this(name, id, password, 21);
}

public Member(String name, String id, String password, int age) {
	this.name = name;
	this.id = id;
	this.password = password;
	this.age = age;
}
}