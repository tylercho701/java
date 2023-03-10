package sec3;

public class Ex5 {

	public static void main(String[] args) {
		// 
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop+lengthBottom)*height/2);
		// 형변환이 식 중간에 포함되어야 하나 괄호로 식을 감쌌기 때문에 값이 누락됨
		System.out.println(area);
	}

}
