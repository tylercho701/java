package sec1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("조교행.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}