package step01;

/*
 * # 화폐매수[문제]
 * 해당 금액의 화폐 종류 별 화폐 매수를 출력한다.
 * 정답)
 * 5만원 : 1장
 * 1만원 : 3장
 * 5천원 : 1장
 * 1천원 : 2장
 * 5백원 : 1개
 * 1백원 : 4개
 */

public class Ex03 {
	public static void main(String[] args) {

		int money = 87900;

		int fifthTho = 0; // 5만
		int tenTho = 0; // 만
		int fiveTho = 0; // 5천
		int oneTho = 0; // 천
		int fiveHun = 0; // 5백
		int oneHun = 0; // 백

		if (money >= 50000) {
			while (money >= 50000) {
				if(money < 50000) {
					return;
				}
				money = money - 50000;
				fifthTho++;
			}
		}
		
		if (money >= 10000) {
			while (money >= 10000) {
				if(money < 10000) {
					return;
				}
				money = money - 10000;
				tenTho++;
			}
		}
		
		if (money >= 5000) {
			while (money >= 5000) {
				if(money < 5000) {
					return;
				}
				money = money - 5000;
				fiveTho++;
			}
		}
		
		if (money >= 1000) {
			while (money >= 1000) {
				if(money < 1000) {
					return;
				}
				money = money - 1000;
				oneTho++;
			}
		}
		
		if (money >= 500) {
			while (money >= 500) {
				if(money < 500) {
					return;
				}
				money = money - 500;
				fiveHun++;
			}
		}
		
		if (money >= 100) {
			while (money >= 100) {
				if(money < 100) {
					return;
				}
				money = money - 100;
				oneHun++;
			}
		}
		
		System.out.println("5만원 : " + fifthTho + "장");
		System.out.println("1만원 : " + tenTho + "장");
		System.out.println("5천원 : " + fiveTho + "장");
		System.out.println("1천원 : " + oneTho + "장");
		System.out.println("5백원 : " + fiveHun + "장");
		System.out.println("1백원 : " + oneHun + "장");

	}
}
