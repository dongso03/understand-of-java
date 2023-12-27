import java.util.Scanner;

//1. 좌석 예약 프로그램 (콘솔 입출력)
// - 10개 좌석이 준비되어 있음.
// - 사용자는 메뉴 선택 입력을 통해, 현재 좌석 예약 상태를 볼 수 있어야 함.
// 출력예) (O : 예약가능한 좌석, X : 예약된 좌석)
//		1 2 3 4 5 6 7 8 9 10
//      O X X O X O O O X X
// - 사용자는 메뉴 선택 입력을 통해, 좌석을 예약할 수 있어야 함.
// 예) 몇 번째 좌석을 예약하시겠습니까? 4
//		 예약 되었습니다.
//		1 2 3 4 5 6 7 8 9 10
//      O X X X X O O O X X

public class QSeats {
	public static void bookingSeats(boolean[] seats) {
		System.out.println("몇 번째 좌석을 예약하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		boolean state = seats[input - 1];
		if (state) {
			System.out.println("예약 되었습니다.");
			seats[input - 1]  = !state;
		} else {
			System.out.println("이미 예약된 자리입니다.");
		}
	}
	
	public static void printSeats(boolean[] seats) {
		System.out.println("현재 좌석 상태");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i]) {
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		System.out.println();
	}
	
	public static int printMenu() {
		System.out.println("1. 현재 좌석 상태 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("기타. 종료");
		
		// 입력
		Scanner scan = new Scanner(System.in);
		int menuNum = scan.nextInt();
		return menuNum;
	}
	
	public static void startProgram(boolean[] seats) {
		while (true) {
			int menuNum = printMenu();
			
			if (menuNum == 1) {
				printSeats(seats);
			} else if (menuNum == 2) {
				printSeats(seats);
				bookingSeats(seats);
				printSeats(seats);
			} else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] seats = new boolean[] { true, false, false, true, false, true, true, true, false, false };
		
		startProgram(seats);
	}
}









