package sec3;

public class StudentEx1 {

	public static void main(String[] args) {
		Student st1 = new Student("조교행");
		st1.setPg(92);
		st1.setDb(93);
		st1.setUi(100);
		st1.setTot();
		st1.setAvg();
		System.out.println("이름 : "+st1.getName());
		System.out.println("총점 : "+st1.getTot());
		System.out.println("평균 : "+st1.getAvg());
		System.out.println("학점 : "+st1.getHak());
	}
}