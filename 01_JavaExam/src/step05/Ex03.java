package step05;

import java.util.Scanner;

// # 관리비[문제]

public class Ex03 {
	public static void main(String[] args) {

			int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
				
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};

		Scanner in = new Scanner(System.in);

		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400

		for (int i = 0; i < pay.length; i++) {
			int allPay = 0;
			for (int j = 0; j < pay.length; j++) {
				allPay = allPay + pay[i][j];
			}
			if (i == pay.length - 1) {
				System.out.print(allPay);
				break;
			}
			System.out.print(allPay + ", ");
		}
		System.out.println("\n");

		// 문제 2) 호를 입력하면 관리비 출력
		// 예 2) 입력 : 202 관리비 출력 : 2000

		System.out.print("입력 : ");
		int ho = in.nextInt();
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt.length; j++) {
				if(apt[i][j] == ho) {
					System.out.println("관리비 : " + pay[i][j]);
				}
			}
		}

		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int max = 0;
		int min = pay[0][0];
		
		int[] maxPlace = {0, 0};
		int[] minPlace = {0, 0};
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay.length; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					maxPlace[0] = i;
					maxPlace[1] = j;
				}
				
				if(min >= pay[i][j]) {
					min = pay[i][j];
					minPlace[0] = i;
					minPlace[1] = j;
				}
			}
		}
		
		System.out.println("관리비가 가장 많이 나온 집(" + apt[maxPlace[0]][maxPlace[1]] + "), " + "가장 적게 나온 집(" + apt[minPlace[0]][minPlace[1]] + ") \n");

		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.print("선택할 호를 입력하세요 : ");
		int ho1 = in.nextInt();
		int ho1Pay = 0;
		int ho1i = 0;
		int ho1j = 0;
		
		System.out.print("교체할 호를 입력하세요 : ");
		int ho2 = in.nextInt();
		int ho2Pay = 0;
		int ho2i = 0;
		int ho2j = 0;
		
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt.length; j++) {
				if(apt[i][j] == ho1) {
					ho1Pay = pay[i][j];
					ho1i = i;
					ho1j = j;
				}
				
				if(apt[i][j] == ho2) {
					ho2Pay = pay[i][j];
					ho2i = i;
					ho2j = j;
				}
			}
			if(ho1Pay != 0 && ho2Pay != 0) {
				pay[ho1i][ho1j] = ho2Pay;
				pay[ho2i][ho2j] = ho1Pay;
				break;
			}
		}
		
		System.out.println("교체완료");
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay.length; j++) {
				System.out.printf("\t" + pay[i][j]);
			}
			System.out.printf("\n");
		}

	}
}
