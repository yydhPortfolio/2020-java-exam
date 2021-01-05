package step05;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 최대값 구하기(3단계)[문제]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */

public class Ex01 {
	public static void main(String[] args) {

		int[] arr = { 11, 87, 42, 100, 24 };
		int maxPlace = 0;

		Scanner in = new Scanner(System.in);

		boolean clear = false;

		while (!clear) {
			int max = 0;

			for (int i = 0; i < arr.length; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					maxPlace = i;
				}
			}

			if (max == 0) {
				System.out.println("arr배열의 모든값이 0 입니다.");
				System.out.println(Arrays.toString(arr));
				break;
			}

			System.out.println(Arrays.toString(arr));
			System.out.print("입력 : ");
			int num = in.nextInt();

			if (num == max) {
				arr[maxPlace] = 0;
			}
		}

	}
}
