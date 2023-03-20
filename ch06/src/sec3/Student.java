package sec3;

public class Student {												// [접근제한자] [지시자] 필드타입 필드명 (= 생략 가능)
	private String name;
	private int age;
	private int pg;
	private int db;
	private int ui;
	private int tot;
	private double avg;
	
	public Student()								{ 				// [접근제한자] 생성자명(=클래스명)([매개변수타입 매개변수명]){}
		this("홍길동");
	}
	public Student(String name){									//오버 로딩
		this(name, 20);
	}
	public Student(String name, int age){
		this(name, age, 50);
	}
	public Student(String name, int age, int pg){
		this(name, age, pg, 50);
	}
	public Student(String name, int age, int pg, int db){
		this(name, age, pg, db, 50);
	}
	public Student(String name, int age, int pg, int db, int ui){
		this.name = name;
		this.age = age;
		this.pg = pg;
		this.db = db;
		this.ui = ui;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getUi() {
		return ui;
	}
	public void setUi(int ui) {
		this.ui = ui;
	}
	public int getTot() {
		return tot;
	}
	public void setTot() {
		this.tot = this.pg + this.db + this.ui;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = this.tot / 3.0;
	}
	
	public String getHak(){
		String hak = "";
		if(this.avg >= 90){
			hak = "A";
		}	else if(this.avg >= 80){
			hak = "B";
		}	else if(this.avg >= 70){
			hak = "C";
		}	else{
			hak = "F";
	}
	return hak;
	}
}