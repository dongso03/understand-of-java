import java.util.Scanner;

// 사용자에게 5개의 정수를 입력받아
// 2자리의 정수의 개수와 합을 출력
// 탐색한 원소들을 나열.

public class TestArray3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 5번입력");
		
		int count = 0;
		int sum = 0;
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			int input = scan.nextInt();
			sum += input;
			arr[i] = input;
		}
		for(int i = 0; i<arr.length; i++) {
			int n = arr[i];
			if (n>=10 && n<100) {
				count++;
				sum += n;
				System.out.println(n);
			}
		}
		System.out.println(count);
		System.out.println(sum);
		
		
	}
}
