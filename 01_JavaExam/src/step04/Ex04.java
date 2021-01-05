package step04;

import java.util.Scanner;

/*
 * # ATM(3단계)[문제]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 }; // 계좌번호 배열
		int[] pws = { 1111, 2222, 0, 0, 0 }; // 비밀번호 배열

		int cnt = 2;

		boolean run = true;
		while (run) {

			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("더이상 가입이 불가합니다.");
					continue;
				}
				boolean overlap = false;
				System.out.println("계좌번호를 입력하세요.");
				int acc = scan.nextInt();
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == acc) {
						System.out.println("이미 사용하고있는 계좌번호입니다.");
						System.out.println();
						overlap = true;
						break;
					}
				}
				if (!overlap) {
					System.out.println("비밀번호를 입력하세요.");
					int pw = scan.nextInt();
					if (cnt >= accs.length && cnt >= pws.length) {
						int[] newArr = adjustArray(accs, 1);
						int[] newArr1 = adjustArray(pws, 1);
						accs = copyArray(accs, newArr, accs.length);
						pws = copyArray(pws, newArr1, pws.length);
					}
					accs[cnt] = acc;
					pws[cnt] = pw;
					cnt++;

					System.out.println("가입이 완료되었습니다.");
				}
				overlap = false;
			} else if (sel == 2) {
				System.out.println("탈퇴할 계좌번호를 입력하세요.");
				int acc = scan.nextInt();
				boolean overlap = false;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == acc) {
						overlap = true;

						while (i < accs.length - 1 && i < pws.length - 1) {
							accs[i] = accs[i + 1];
							pws[i] = pws[i + 1];
							i++;
						}
						cnt--;
					}
				}
				System.out.println("탈퇴를 완료하였습니다.");
				System.out.println();
				if (!overlap) {
					System.out.println("입력하신 계좌번호는 존재하지않습니다.");
					System.out.println();
				}
			} else if (sel == 3) {

				for (int i = 0; i < cnt; i++) {
					if (i == cnt - 1) {
						System.out.print(accs[i]);
						continue;
					}
					System.out.print(accs[i] + ", ");
				}
				System.out.println();

				for (int i = 0; i < cnt; i++) {
					if (i == cnt - 1) {
						System.out.print(pws[i]);
						continue;
					}
					System.out.print(pws[i] + ", ");
				}
				System.out.println();
			}

		}

		scan.close();

	}

	public static int[] adjustArray(int[] arr, int fixLength) {
		int currentLength = arr.length;
		fixLength += currentLength;
		int[] newArr = new int[fixLength];
		return newArr;
	}

	public static int[] copyArray(int[] arr, int[] target, int cnt) {
		for (int i = 0; i < cnt; i++) {
			target[i] = arr[i];
		}
		return target;
	}
}
