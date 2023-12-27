import java.util.Arrays;
import java.util.Scanner;

//좌석 예약 프로그램(콘솔 입출력)
//10개 좌석이 준비되어있음.
//사용자는 메뉴 선택 입력을 통해, 현재 좌석 예약 상태를 볼수 있어야함.
//출력예)
//1 2 3 4 5 6 7 8 9 10
//o x x o x o o o x x
// 사용자는 메뉴 선택 입력을 통해 , 좌석을 예약할수 있어야함.
// 몇번째 좌석 예약하시겠? 4
// 예약되었습니다.
//1 2 3 4 5 6 7 8 9 10
//o x x x x o o o x x
//public class Seats {

//	public static void bookingSeats(boolean[] seats) {
//		System.out.println("몇 번째 좌석을 예약하시겠습니까?");
//		Scanner scan = new Scanner(System.in);
//		int input = scan.nextInt();
//		boolean state = seats[input - 1];
//		if (state) {
//			System.out.println("예약 되었습니다.");
//			seats[input - 1]  = !state;
//		} else {
//			System.out.println("이미 예약된 자리입니다.");
//		}
//	}
//	
//	public static void printSeats(boolean[] seats) {
//		System.out.println("현재 좌석 상태");
//		System.out.println("1 2 3 4 5 6 7 8 9 10");
//		for (int i = 0; i < seats.length; i++) {
//			if (seats[i]) {
//				System.out.print("O ");
//			} else {
//				System.out.print("X ");
//			}
//		}
//		System.out.println();
//	}
//	
//	public static int printMenu() {
//		System.out.println("1. 현재 좌석 상태 확인");
//		System.out.println("2. 좌석 예약");
//		System.out.println("기타. 종료");
//		
//		// 입력
//		Scanner scan = new Scanner(System.in);
//		int menuNum = scan.nextInt();
//		return menuNum;
//	}
//	
//	public static void startProgram(boolean[] seats) {
//		while (true) {
//			int menuNum = printMenu();
//			
//			if (menuNum == 1) {
//				printSeats(seats);
//			} else if (menuNum == 2) {
//				printSeats(seats);
//				bookingSeats(seats);
//				printSeats(seats);
//			} else {
//				break;
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		boolean[] seats = new boolean[] { true, false, false, true, false, true, true, true, false, false };
//		
		//startProgram(seats);
//	}
//}
//
//
//        System.out.println("좌석 상태");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("몇번좌석 예약?");
//        while (true) {
//            int input = scan.nextInt();
//            if (arr2[input - 1] == 'o') {
//                arr2[input - 1] = arr3[input - 1];
//                System.out.println(Arrays.toString(arr));
//                System.out.println(Arrays.toString(arr2));
//                System.out.println("예약성공");
//                System.out.println("전좌석 예매시 프로그램종료");
//            } else if (arr2[input - 1] == 'x') {
//                System.out.println("이미예약된좌석");
//                System.out.println(Arrays.toString(arr));
//                System.out.println(Arrays.toString(arr2));
//                System.out.println("다른좌석 예약?");
//                System.out.println("전 좌석 예매시 프로그램종료");
//            } if (finish(arr2 )) { 
//                System.out.println("예약 종료");
//                break; 
//            }
//        }
//
