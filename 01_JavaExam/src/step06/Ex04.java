package step06;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영화관 좌석예매[문제]
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Movie {
	int[] seat = new int[7];
	int money = 0;
}

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Movie mega = new Movie();
		int[] seat = mega.seat;
		int money = mega.money;

		while (true) {

			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println();
				System.out.println(Arrays.toString(seat));
				System.out.print("좌석 선택 : ");
				int select = scan.nextInt();
				if (seat[select] == 1) {
					System.out.println("이미 예매가 완료된 자리입니다.");
					System.out.println();
					continue;
				} else {
					seat[select] = 1;
					money = money + 12000;
					System.out.println("예매완료");
					System.out.println();
				}
			} else if (sel == 2) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println("매출액 : " + money + "원");

		scan.close();

	}
}
