
// 사용자의 입려과 결과 출력통해 자판기시뮬레이션
// 콘솔창에 
//1.상품 목록
//2. 선택 후 구입
import java.util.Scanner;

public class VendingMachine {

	final String MENU1 = "콜라";
	final String MENU2 = "사이다";
	final String MENU3 = "솔의눈";

	private void menu() {
		System.out.println("상품번호를 선택하시오");
		System.out.println("1." + MENU1);
		System.out.println("2." + MENU2);
		System.out.println("3." + MENU3);
	}

	private int userInput() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}

	private void price(int input) {
		if (input == 1) {
			System.out.println("선택한 물품은 " + MENU1);
		} else if (input == 2) {
			System.out.println("선택한 물품은 " + MENU2);
		} else if (input == 3) {
			System.out.println("선택한 물품은 " + MENU2);
		}
	}

	public void printall() {
		while (true) {
			menu();
			int input = userInput();
			if(input < 1 || input >3) {
				System.out.println("입력 오류로 종료");
				break;
			}
			price(input);
		}
	}
}
