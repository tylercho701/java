package practice1;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accinfo = new Account[100];
	public static void main(String[] args) {
		// 계좌 입출금 관리 프로그램 (ch6-20)
		Scanner num = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		
		boolean sw = true;
		
		while (sw){
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			int chn = num.nextInt();
			switch (chn){
				case 1 :
					System.out.println("----------");
					System.out.println("계좌 생성");
					System.out.println("----------");
					System.out.print("계좌번호 : ");
					String anu = str.nextLine();
					System.out.print("계좌주 : ");
					String aon = str.nextLine();
					System.out.print("초기입금액 :");
					int money = num.nextInt();
					Account newAccount = new Account(anu, aon, money);
					for(int i=0; i<accinfo.length; i++) {
						if(accinfo[i] == null) {
							accinfo[i] = newAccount;
							System.out.println("결과: 계좌가 생성되었습니다.");
							break;
					}
				}
				break;
				
				case 2 :
					System.out.println("----------");
					System.out.println("계좌 목록");
					System.out.println("----------");
					for(int i=0; i<accinfo.length; i++) {
						Account account = accinfo[i];
						if(account != null) {
							System.out.print(account.getAnu());
							System.out.print(" ");
							System.out.print(account.getAon());
							System.out.print(" ");
							System.out.print(account.getMoney());
							System.out.println();
						}
					}
					break;
					
				case 3 :
					System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					System.out.print("계좌번호 : ");
					String anu1 = str.nextLine();
					System.out.print("예금액 :");
					int money1 = num.nextInt();
					Account account = findAccount(anu1);
					if(account == null) {
						System.out.println("결과: 계좌가 없습니다.");
						return;
					}
					account.setMoney(account.getMoney() + money1);
					System.out.println("결과: 예금이 성공되었습니다.");
					break;
					
				case 4 :
					System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
					System.out.print("계좌번호 : ");
					String anu2 = str.nextLine();
					System.out.print("출금액 :");
					int money2 = num.nextInt();
					Account account2 = findAccount(anu2);
					if(account2 == null) {
						System.out.println("결과: 계좌가 없습니다.");
						return;
					}
					account2.setMoney(account2.getMoney() - money2);
					System.out.println("결과: 출금이 성공되었습니다.");
					break;
					
				case 5 : 
					System.out.println("프로그램 종료");
					sw = false;
			}
		}
	}
	private static Account findAccount(String anu) {
		Account account = null;
		for(int i=0; i<accinfo.length; i++) {
			if(accinfo[i] != null) {
				String dbAnu = accinfo[i].getAnu();
				if(dbAnu.equals(anu)) {
					account = accinfo[i];
					break;
				}
			}
		}
		return account;
	}
}