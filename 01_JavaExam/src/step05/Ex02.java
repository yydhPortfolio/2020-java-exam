package step05;

import java.util.Arrays;

/*
 * # 정렬하기[문제]
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */

public class Ex02 {
	public static void main(String[] args) {

		int[] score = { 10, 50, 30, 40, 80, 7 };
		int cnt = 0;

		while (true) {
			System.out.println(Arrays.toString(score));
			int max = 0;
			int maxPlace = 0;
			for (int i = cnt; i < score.length; i++) {
				if (max < score[i]) {
					max = score[i];
					maxPlace = i;
				}
			}

			int now = score[cnt];

			score[cnt] = max;
			score[maxPlace] = now;
			cnt++;

			if (cnt >= score.length)
				break;
		}

	}
}
