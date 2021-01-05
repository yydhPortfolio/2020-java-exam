package step02;

import java.util.Scanner;

/*
 * # ATM[문제]
 * [1]로그인
 * . 계좌번호와 비밀번호를 입력받아 로그인을 처리한다.
 * . 이미 로그인 된 상태에서 다시 이용할 수 없다.
 * [2]로그아웃
 * . 로그아웃 상태에서 이용할 수 없다.
 * [3]입금
 * . 로그인 상태에서 이용할 수 있다.
 * . 입금할 금액을 입력받아 입금을 진행한다.
 * [4]출금
 * . 로그인 상태에서 이용할 수 있다.
 * . 출금할 금액이 계좌잔액을 초과할 경우 출금을 진행할 수 없다.
 * [5]이체
 * . 로그인 상태에서 이용할 수 있다.
 * . 이체할 계좌번호를 입력받아 처리한다.
 * . 이체할 금액이 계좌잔액을 초과할 경우 이체를 진행할 수 없다.
 * [6]잔액조회
 * . 로그인 상태에서 이용할 수 있다.
 * . 로그인 된 회원의 계좌잔액을 출력한다.
 */

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int acc1 = 1111;
		int pw1 = 1234;
		int money1 = 10000;
		
		int acc2 = 2222;
		int pw2 = 1234;
		int money2 = 20000;
		
		/*
		 * # log 값의 의미
		 * (1)로그아웃			: -1
		 * (2)acc1 로그인		: 1
		 * (3)acc2 로그인		: 2
		 */
		int log = -1;		
		
		while(true) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]입금");
			System.out.println("[4]출금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");
			
			System.out.print("메뉴를 선택하세요 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == 1 || log == 2) {
					System.out.println("이미 로그인 상태입니다.");
					continue;
				}
				System.out.println("아이디를 입력하세요.");
				int id = scan.nextInt();
				
				if(id == acc1) {
					System.out.println("비밀번호를 입력하세요.");
					int pass = scan.nextInt();
					if(pass == pw1) {
						System.out.println("로그인 성공");
						log = 1;
					} else {
						System.out.println("비밀번호를 다시 확인해주세요.");
					}
				} else if(id == acc2) {
					System.out.println("비밀번호를 입력하세요.");
					int pass = scan.nextInt();
					if(pass == pw2) {
						System.out.println("로그인 성공");
						log = 2;
					} else {
						System.out.println("비밀번호를 다시 확인해주세요.");
					}
				} else {
					System.out.println("아이디를 다시 확인해주세요.");
				}
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("이미 로그아웃상태 입니다.");
					continue;
				}
				log = -1;
				System.out.println("로그아웃 완료");
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				
				System.out.println("입금할 금액을 입력해주세요.");
				int money = scan.nextInt();
				if(log == 1) {
					money1 = money1 + money;
					System.out.printf("입금완료.\n현재금액 : " + money1 + "\n");
				} else if(log == 2) {
					money2 = money2 + money;
					System.out.println("입금완료.\n현재금액 : " + money2 + "\n");
				}
				
				
			}
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				System.out.println("출금할 금액을 입력해주세요.");
				if(log == 1) {				
					System.out.println("현재 보유한 금액 : " + money1);
					int money = scan.nextInt();
					if(money > money1) {
						System.out.println("출금할 금액이 형재 보유한 금액을 초과합니다.");
						continue;
					} else {
						money1 = money1 - money;
						System.out.printf("출금완료.\n현재금액 : " + money1 +"\n");
					}
				} else if(log == 2) {
					System.out.println("현재 보유한 금액 : " + money2);
					int money = scan.nextInt();
					if(money > money2) {
						System.out.println("출금할 금액이 형재 보유한 금액을 초과합니다.");
						continue;
					} else {
							money2 = money2 - money;
							System.out.printf("출금완료.\n현재금액 : " + money2 +"\n");
						}
				}
				
			}
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				System.out.println("이체할 계좌를 입력하세요.");
				if(log == 1) {
					int acc = scan.nextInt();
					if(acc == acc1) {
						System.out.println("자기 자신에게 이체할 수 없습니다.");
						continue;
					} else if(acc == acc2) {
						System.out.println("이체할 금액을 입력하세요.");
						int money = scan.nextInt();
						if(money > money1) {
							System.out.println("이체할 금액이 보유금액을 초과합니다.");
							continue;
						}
						money1 = money1 - money;
						money2 = money2 + money;
						System.out.printf("이체완료.\n현재금액 : " + money1 +"\n");
					}
				} else if(log == 2) {
					int acc = scan.nextInt();
					if(acc == acc1) {
						System.out.println("이체할 금액을 입력하세요.");
						int money = scan.nextInt();
						if(money > money2) {
							System.out.println("이체할 금액이 보유금액을 초과합니다.");
							continue;
						}
						money2 = money2 - money;
						money1 = money1 + money;
						System.out.printf("이체완료.\n현재금액 : " + money2 +"\n");
					} else if(acc == acc2) {
						System.out.println("자기 자신에게 이체할 수 없습니다.");
						continue;
					}
				}
				
			}
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				if(log == 1) {
					System.out.println("잔액 : " + money1);
				} else if(log == 2) {
					System.out.println("잔액 : " + money2);
				}
				
			}
			else if(sel == 0) {
				System.out.println("[메세지]프로그램 종료");
				break;
			}
			
		}
		
		scan.close();
		
	}
}
