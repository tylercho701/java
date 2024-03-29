package sec4;

public class BoardEx {

	public static void main(String[] args) {
		// static field나 static method는 객체 생성 없이 사용할 것
		Board b1 = new Board();
		Board b2 = new Board();

		b2.title = "제목 연습";
		b2.content = "내용 연습";
		
		System.out.println(b1.title);
		System.out.println(b1.title);
		
		System.out.println(b1.con);			// static 블록으로 감싼 데이터는 원본을 유지함
		System.out.println(b2.allData);		// 데이터 원본을 유지하고자 한다면 static block(=정적 블록 / static {} )으로 처리할 것
		
		//b1.outputData();		static method는 객체를 생성 했더라도 생성한 객체로 사용하지 않음
		Board.outputData();
	}
}