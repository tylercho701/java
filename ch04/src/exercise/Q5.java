package exercise;

public class Q5 {

	public static void main(String[] args) {
		// Q5
		
		int x;
		int y;
		
		for (x=1; x<=10; x++) {
			if (x % 5 <=0)
			for(y=1; y<=10; y++){
				if (y % 4 <=0)
				System.out.println("( "+x+" , "+y+" )");
			}
		}
	}
}

/*	
	4x * 5y = 60에 해당하는 자연수 x, y
	5, 8
	10, 4
*/