package step07;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드[문제]
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 student 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * student = {1, 1, 4, 4, 3}
 * 정오표      = {O, X, O, X, X}
 * 성적         = 40점
 */

class School {

	Random ran = new Random();

	int[] omr = { 1, 4, 3, 2, 2 }; // 모범답안
	int[] me = new int[5]; // 학생답안

	int cnt = 0; // 정답 맞춘 개수
	int score = 0; // 성적
}

public class Ex03 {
	public static void main(String[] args) {
		School school = new School();
		int[] omr = school.omr;
		int[] me = school.me;
		int cnt = school.cnt;
		int score = school.score;
		String[] omrs = new String[5];

		for (int i = 0; i < me.length; i++) {
			int rdNum = school.ran.nextInt(5) + 1;
			me[i] = rdNum;
		}

		for (int i = 0; i < me.length; i++) {

			if (omr[i] == me[i]) {
				omrs[i] = "O";
				cnt++;
			} else {
				omrs[i] = "X";
			}

		}
		score = 20 * cnt;
		System.out.println("answer  = {" + Arrays.toString(omr) + "}");
		System.out.println("student = {" + Arrays.toString(me) + "}");
		System.out.println("정오표      = {" + Arrays.toString(omrs) + "}");
		System.out.println("성적         = " + score + "점");
	}
}
