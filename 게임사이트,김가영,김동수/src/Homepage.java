

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Homepage {
	public static void playGame() {
		Scanner scan = new Scanner(System.in);

		boolean go = true;
		int cash = 10000;
		int randomGame = 1;
		while (go) {

			System.out.println("----메뉴----");
			System.out.println("1. 랜덤 아이템 증정 이번트");
			System.out.println("2. 아이템 샵 이동");

			System.out.println("기타. 홈페이지 종료");
			System.out.println("-----------");
			int input = scan.nextInt();

			switch (input) {
			case 1: // 랜덤 아이템 증정 이벤트 
				// 랜덤 아이템 증정 이벤트를 한 번 했다면 다시  참여할 수 없음.
				if (randomGame == 0) {
					System.out.println("랜덤 아이템 증정 이벤트에 참여하셨습니다.");
					break;
				}

				System.out.println("--서버 종료 마지막 랜덤 이벤트 증정 이벤트.--");

				String[] item = new String[] { "캐릭터 옷", "동수 셀카", "전설템", "회복포션", "강화권" };
				System.out.println("받을 수 있는 아이템: " + Arrays.toString(item));
				System.out.println("시작하시려면 아무 숫자를 적어주세요.");
				int start = scan.nextInt();

				Random ran = new Random();
				int r = ran.nextInt(100);
				System.out.print("축하합니다. ");
				// 아이템마다 받을 수 있는 확률을 다르게 해줌.
				if (r < 20) {
					System.out.println(item[0] + " 획득");
				} else if (r < 45) {
					System.out.println(item[1] + " 획득");
				} else if (r < 50) {
					System.out.println(item[2] + " 획득");
				} else if (r < 80) {
					System.out.println(item[3] + " 획득");
				} else {
					System.out.println(item[4] + " 획득");
				}
				randomGame--;

				break;

			case 2: // 아이템 구매 샵

				System.out.println("--아이템 조회 및 구매--");

				System.out.println("1.회색 고양이 세트: 1000");
				System.out.println("2.장비 세트: 18900");
				System.out.println("어떤 걸 구매하시겠습니까? 현재 캐시량: " + cash);
				int input4 = scan.nextInt();
				if (input4 == 1) {
					if (cash >= 1000) {
						cash -= 1000;
						System.out.println("회색 고양이 세트 구매 완료. 남은 캐시량: " + cash);
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else if (input4 == 2) {
					if (cash >= 18900) {
						cash -= 18900;
						System.out.println("장비 세트 구매 완료. 남은 캐시량: " + cash);
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				}

				break;

			default:
				System.out.println("게임홈페이지를 종료합니다.");
				go = false;
				break;

			}

		}
	}
}