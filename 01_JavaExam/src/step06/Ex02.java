package step06;

import java.util.Scanner;

//# 학생성적관리 프로그램(2단계)[문제]

class School {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ex02 {
	public static void main(String[] args) {

		School school = new School();
		int[] scores = school.scores;
		int[] hakbuns = school.hakbuns;
		Scanner in = new Scanner(System.in);

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for (int i = 0; i < school.scores.length; i++) {
			scores[i] = (int) (Math.random() * 100 + 1);
		}

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("총점(" + sum + ")" + "평균(" + (double) ((double) sum / scores.length) + ")");

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생 수 : " + cnt);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.print("인덱스 입력 : ");
		int index = in.nextInt();
		System.out.println("성적 : " + scores[index] + "점");

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = in.nextInt();
		for(int i = 0; i < scores.length; i++) {
			if(score == scores[i]) {
				System.out.println("인덱스 : " + i);
				break;
			}
		}

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.print("학번 입력 : ");
		int id = in.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i] == id) {
				System.out.println("성적 : " + scores[i] + "점");
			}
		}

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int id1 = in.nextInt();
		int ok = 0;
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i] == id1) {
				System.out.println("성적 : " + scores[i] + "점");
				ok++;
			}
		}
		if(ok == 0) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = 0;
		int maxNum = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
				maxNum = i;
			}
		}
		System.out.println(hakbuns[maxNum] + "번(" + max + "점)");

	}
}
