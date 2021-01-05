package step03;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임(3단계)[문제]
 * 1. 랜덤 숫자를 2개 저장하여,
 * 2. 구구단 문제를 5회 출제한다.
 * 3. 한 문제당 20점으로 게임 종료 후 게임성적을 출력한다.
 */

public class Ex01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		int cnt = 0;

		System.out.println("구구단 문제 5개 (1개당 20점)");
		for (int i = 0; i < 5; i++) {
			int num1 = rnd.nextInt(9) + 1;
			int num2 = rnd.nextInt(9) + 1;
			System.out.print(num1 + " X " + num2 + " = ");
			int num = in.nextInt();
			if (num == num1 * num2) {
				cnt++;
				System.out.println("정답.");
			} else {
				System.out.println("오답.");
			}
		}
		System.out.println("점수 : " + 20 * cnt);

	}
}
