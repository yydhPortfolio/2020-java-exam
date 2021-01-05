package step06;

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

class OmarCard {
	int[] answer = { 1, 3, 4, 2, 5 }; // 시험답안
	int[] student = new int[5]; // 학생답안

	int cnt = 0; // 정답 맞춘 개수
	int score = 0; // 성적
}

public class Ex03 {
	public static void main(String[] args) {
		OmarCard omr = new OmarCard();
		int[] student = omr.student;
		int[] answer = omr.answer;
		int grade = omr.score;
		int cnt = omr.cnt;
		String[] omrs = new String[5];
		Random rd = new Random();

		for (int i = 0; i < student.length; i++) {
			int rdNum = rd.nextInt(5) + 1;
			student[i] = rdNum;
		}

		for (int i = 0; i < student.length; i++) {

			if (answer[i] == student[i]) {
				omrs[i] = "O";
				cnt++;
			} else {
				omrs[i] = "X";
			}
			
		}
		grade = 20 * cnt;
		System.out.println("answer  = {" + Arrays.toString(answer) +"}");
		System.out.println("student = {" + Arrays.toString(student) +"}");
		System.out.println("정오표      = {" + Arrays.toString(omrs) +"}");
		System.out.println("성적         = " + grade + "점");
	}
}
