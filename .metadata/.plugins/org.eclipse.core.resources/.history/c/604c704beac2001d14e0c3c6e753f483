package exercise;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Q7
		
		Scanner sc = new Scanner(System.in);
		
		int insert = 0;
		int extract = 0;
		int deposit = 0;
		
		boolean ps = true;
		
		while (ps) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("번호를 입력해 주세요.");
			int ord = sc.nextInt();
				switch (ord) {
					case 1 :
						System.out.println("선택한 업무 번호 : "+ord+". 예금");
						System.out.println("입금할 금액을 입력해 주세요.");
						insert = sc.nextInt();
						deposit = deposit + insert;
						System.out.println("입금 후 잔액 : "+deposit+"\n");
						break;
						
					case 2 :
						System.out.println("선택한 업무 번호 : "+ord+". 출금");
						System.out.println("출금할 금액을 입력해 주세요.");
						extract = sc.nextInt();
						deposit = deposit -extract;
						System.out.println("출금 후 잔액 : "+deposit+"\n");
						break;
						
					case 3 :
						System.out.println("선택한 업무 번호 : "+ord+". 잔고");
						System.out.println("잔금 확인");
						System.out.println("잔	액 : "+deposit+"\n");
						break;
						
					case 4 :
						System.out.println("선택한 업무 번호 : "+ord+". 종료");
						System.out.println("종	료");
						ps = false;
						break;
						
					default :
						System.out.println("번호를 잘못 입력 하셨습니다.");
				}
		}
	}
}