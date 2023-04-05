package sec3;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties p1 = new Properties();
		try {
			p1.load(PropertiesEx1.class.getResourceAsStream("css.properties"));
			System.out.println("글자크기 : "+p1.getProperty("fontSize"));
			System.out.println("글자색 : "+p1.getProperty("color"));
			System.out.println("배경색상 : "+p1.getProperty("backgroundColor"));
			System.out.println("넓이 : "+p1.getProperty("width"));
			System.out.println("높이 : "+p1.getProperty("height"));
			System.out.println("안 여백 : "+p1.getProperty("padding"));
			System.out.println("바깥 여백 : "+p1.getProperty("margin"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}