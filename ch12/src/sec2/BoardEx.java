package sec2;

public class BoardEx {

	public static void main(String[] args) {
		Board b1 = new Board();
		
		b1.setBno(1);
		b1.setTitle("조교행");
		b1.setTitle("lombok 활용하기");
		
		System.out.println(b1.getBno());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());
	}
}