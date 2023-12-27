import java.util.Arrays;
import java.util.Scanner;

//사용자가 음수를 입력 할때까지
// 반복입력을 받는 프로그램.

// 종료전 최근 5개의 정수들을 나열 (순서무관)
public class LastFive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int count =0;
		
		while (true) {
			int input = scan.nextInt();
			
			
			if (input <0) {
				break;
			}
			num[count] = input;
			count++;
			if (count >= 5) {
				count =0;
			}
			
			
		}
	System.out.println(Arrays.toString(num));
	}
}
