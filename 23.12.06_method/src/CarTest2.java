import java.util.Scanner;

//사용자가 자동차의 속도를 결정하고
// 감가속 및 속도확인 조작 가능
public class CarTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car go = new Car();
		
		System.out.println("자동차속도");
		go.speed = scan.nextInt();
		
		out:
		while (true) {
		System.out.println("1.가속");
		System.out.println("2.감속");
		System.out.println("3.현재속도");
		
		int select = scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("얼마만큼 증가시킬거?");
			int amount = scan.nextInt();
			go.fast(amount);
			break;
		case 2:
			System.out.println("얼마만큼 감소시킬거?");
			int amount2 = scan.nextInt();
			go.slow(amount2);
			break;
		case 3:
			System.out.println(go.speed);
			break;
			default:
				System.out.println("잘못된입력 으로 종료");
				break out;
		}
	}
	}
}

