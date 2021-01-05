package step07;

import java.util.Random;
import java.util.Scanner;

//# 학생성적관리 프로그램(2단계)[문제]

class Student {
	int hakbun;
	int score;
}

class StudentMng {
	void test1(int[] x) {
		Random ran = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = ran.nextInt(100) + 1;
			System.out.print(x[i]);
			if (i != x.length - 1) {
				System.out.print(", ");
			}
		}
	};

	int test2(int[] x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}

	double test3(int[] x) {
		double avg = 0;
		for(int i = 0; i < x.length; i++) {
			avg = avg + x[i];
		}
		avg = avg / x.length;
		return avg;
	}

	int test4(int[] x) {
		int cnt = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] >= 60) {
				cnt++;
			}
		}
		return cnt;
	}

	int test5(int[] x, int idx) {
		return x[idx];
	}

	int test6(int[] x, int score) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] == score) {
				return i;
			}
		}
		return -1;
	}

	int test7(int[] x, int[] y, int hakbun) {
		int idx = -1;
		for(int i = 0; i < x.length; i++) {
			if(x[i] == hakbun) {
				return y[i];
			}
		}
		return -1;
	}

	Student test8(int[] x, int[] y) {
		int max = 0;
		int maxIdx = -1;
		for(int i = 0; i < y.length; i++) {
			if(max < y[i]) {
				max = y[i];
				maxIdx = i;
			}
		}
		Student stu = new Student();
		stu.hakbun = x[maxIdx];
		stu.score = max;
		return stu;
	}
}

public class Ex02 {
	public static void main(String[] args) {

		StudentMng sm = new StudentMng();

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
		// 예 1) 87, 11, 92, 14, 47
		sm.test1(scores);
		System.out.println();

		// 문제2) 전교생의 총점 리턴 메서드
		// 예 2) 총점(251) 평균(50.2)
		int sum = sm.test2(scores);
		double avg = (double)sum / scores.length;
		System.out.println("총점(" + sum + ")" + " 평균(" + avg + ")");

		// 문제3) 전교생의 평균 리턴 메서드
		// 예 3) 평균(50.2)
		double avg1 = sm.test3(scores);
		System.out.println("평균(" + avg1 + ")");

		// 문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
		// 예 4) 2명
		int cnt = sm.test4(scores);
		System.out.println(cnt + "명");

		// 문제5) 인덱스를 전달받아 성적 리턴 메서드
		// 정답5) 인덱스 입력 : 1 성적 : 11점
		Scanner in = new Scanner(System.in);
		System.out.print("인덱스 입력 : ");
		int idx = in.nextInt();
		int score = sm.test5(scores, idx);
		System.out.println("성적 : " + score + "점");

		// 문제6) 성적을 전달받아 인덱스 리턴 메서드
		// 단, 없는 성적 입력 시 예외처리
		// 정답6) 성적 입력 : 11 인덱스 : 1
		System.out.print("성적 입력 : ");
		int score1 = in.nextInt();
		int idx1 = sm.test6(scores, score1);
		if(idx1 == -1) {
			System.out.println("없는성적입니다.");
		} else {
			System.out.println("인덱스 : " + idx1);
		}

		// 문제7) 학번을 전달받아 성적 리턴 메서드
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당 학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int hakbun = in.nextInt();
		int score2 = sm.test7(hakbuns, scores, hakbun);
		if(score2 == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		} else {
			System.out.println("성적 : " + score2 + "점");
		}

		// 문제9) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
		// 정답9) 1004번(98점)
		Student stu = sm.test8(hakbuns, scores);
		System.out.println(stu.hakbun + "번(" + stu.score + ")점");

	}
}
