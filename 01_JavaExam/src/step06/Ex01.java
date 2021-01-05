package step06;

//# 학생성적관리 프로그램(1단계)[문제]

class ScoreMng {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ex01 {
	public static void main(String[] args) {

		ScoreMng score = new ScoreMng();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < score.arr.length; i++) {
			sum = sum + score.arr[i];
		}
		System.out.println(sum);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int four = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 4 == 0) {
				four = four + score.arr[i];
			}
		}
		System.out.println(four);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int fourCnt = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 4 == 0) {
				fourCnt++;
			}
		}
		System.out.println(fourCnt);

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int cnt = 0;
		for (int i = 0; i < score.arr.length; i++) {
			if (score.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
