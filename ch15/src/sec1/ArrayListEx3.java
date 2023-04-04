package sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// List는 ArrayList와 Vector 등의 클래스의 부모 클래스이다.
		ArrayList<Student> stArr = new ArrayList<>();
		int cnt = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("작업번호 [1-5] : 1. 점수 입력, 2. 목록, 3. 삭제, 4. 편집, 5. 종료");
			int job = Integer.parseInt(sc.nextLine());
			if(job==1){
				cnt++;
				Student st = new Student();
				System.out.print("이름 : ");
				st.setName(sc.nextLine());
				System.out.print("국어 : ");
				st.setKor(Integer.parseInt(sc.nextLine()));
				System.out.print("영어 : ");
				st.setEng(Integer.parseInt(sc.nextLine()));
				System.out.print("수학 : ");
				st.setMat(Integer.parseInt(sc.nextLine()));
				st.setNo(cnt);
				stArr.add(st);
			} else if(job==2){
				for(Student s : stArr){
					System.out.println(s);
				}
			} else if(job==3){
				System.out.println("삭제할 정보에 해당하는 학생의 번호를 입력하세요.");
				stArr.remove((Integer.parseInt(sc.nextLine())-1));
			}
		}
	}
}