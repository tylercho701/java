package sec3;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) {
		Properties pro1 = new Properties();
		try {
			pro1.load(PropertiesEx1.class.getResourceAsStream("db.properties"));
			System.out.println("드라이버 : "+pro1.getProperty("driver"));
			System.out.println("url : "+pro1.getProperty("url"));
			System.out.println("username : "+pro1.getProperty("username"));
			System.out.println("password : "+pro1.getProperty("password"));
			// setProperty(key, value) : 기존 값 변경
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}