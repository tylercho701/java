package sec1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// switch~case(조건분기문)
		
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int balance = 0;
		
		
		boolean ps = true;
		while (ps) {
			System.out.println("업무 번호를 입력하세요 [0-4]");
			int or = sc.nextInt();
				switch (or) {
					case 0 :
						System.out.println("종료");
						ps = false;
						break;
						
					case 1 :
						System.out.println("입금할 금액을 입력하세요.");
						money = sc.nextInt();
						balance = balance + money;
						System.out.println("입금 후 잔액 : "+balance);
						break;
					
					case 2 :
						System.out.println("출금할 금액을 입력하세요.");
						money = sc.nextInt();
						balance = balance - money;
						System.out.println("출금 후 잔액 : "+balance);
						break;
					
					case 3 :
						System.out.println("예금 조회");
						System.out.println("잔액 : "+balance);
						break;
						
					case 4 :
						System.out.println("계좌 이체");
						System.out.println("보낼 금액 : ");
						money = sc.nextInt();
						balance = balance - money;
						System.out.println("이체 후 잔액 : "+balance);
						break;
						
					default :
						System.out.println("번호를 잘못 입력 하셨습니다.");
			}
		}
	}
}