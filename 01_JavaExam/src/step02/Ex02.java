package step02;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한[문제]
 * 1. 키를 입력받는다.
 * 2. 키가 110 이상이면, 놀이기구 이용이 가능하다.
 * 3. 키가 110 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우에는 놀이기구를 이용할 수 있다.
 * 5. 부모님과의 동행여부를 1(yes) 또는 0(no)을 입력받아 확인한다.
 */

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요.");
		
		int height = sc.nextInt();
		
		if(height >= 110) {
			System.out.println("놀이기구를 이용 가능합니다.");
		} else {
			System.out.println("부모님과의 동행여부를 1(yes) 또는 0(no)로 입력하세요.");
			String par = sc.next();
			if(par.equals("1") || par.equals("yes")) {
				System.out.println("놀이기구를 이용 가능합니다.");
			} else if(par.equals("0") || par.equals("no")) {
				System.out.println("놀이기구를 이용할 수 없습니다.");
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
