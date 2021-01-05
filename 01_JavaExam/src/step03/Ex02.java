package step03;

import java.util.Scanner;

/*
 * # 영수증 출력(2단계)[문제]
 * 1. 메뉴판의 번호를 입력받아 주문을 받는다.
 * 2. 계산하기를 누르면, 영수증을 출력한다.
 * 3. 돈을 입력받아, 잔돈을 출력한다.
 */

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int price1 = 3400;
		int price2 = 4100;
		int price3 = 1700;

		int psy = 0;
		int potato = 0;
		int potabur = 0;

		while (true) {

			System.out.println("[Moms Burger Menu]");
			System.out.println("[1]싸이버거 : " + price1 + "원");
			System.out.println("[2]포테이토버거 : " + price2 + "원");
			System.out.println("[3]감자튀김 : " + price3 + "원");
			System.out.println("[0]계산하기");
			System.out.print("메뉴를 선택하세요 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("[메세지]싸이버거 1개 주문하였습니다.");
				psy++;
			} else if (sel == 2) {
				System.out.println("[메세지]포테이토버거 1개 주문하였습니다.");
				potabur++;
			} else if (sel == 3) {
				System.out.println("[메세지]감자튀김 1개 주문하였습니다.");
				potato++;
			} else if (sel == 0) {
				break;
			}

		}

		System.out.println("주문내역");
		System.out.println("싸이버거 : " + psy + "개");
		System.out.println("포테이토버거 : " + potabur + "개");
		System.out.println("감자튀김 : " + potato + "개");
		psy = psy * price1;
		potabur = potabur * price2;
		potato = potato * price3;
		System.out.println("총액 : " + (psy + potabur + potato));

		scan.close();
	}
}
