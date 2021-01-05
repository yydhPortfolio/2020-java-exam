package step07;

//# 학생성적관리 프로그램(1단계)[문제]

class ScoreMng {

	int test1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	int test2(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	int test3(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	int test4(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

}

public class Ex01 {
	public static void main(String[] args) {

		ScoreMng sm = new ScoreMng();

		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 리턴
		// 정답 1) 362
		sm.test1(arr);
		System.out.println(sm.test1(arr));

		// 문제 2) 4의 배수의 합 리턴
		// 정답 2) 264
		sm.test2(arr);
		System.out.println(sm.test2(arr));

		// 문제 3) 4의 배수의 개수 리턴
		// 정답 3) 3
		sm.test3(arr);
		System.out.println(sm.test3(arr));

		// 문제 4) 짝수의 개수 리턴
		// 정답 4) 3
		sm.test4(arr);
		System.out.println(sm.test4(arr));

	}
}
