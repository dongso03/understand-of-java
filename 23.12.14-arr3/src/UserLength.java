import java.util.Scanner;

//사용자가 입력한 정수만큼
//정수를 반복 입력 받아
//입력받은 정수들중, 소수의 개수와 목록을 출력하기



public class UserLength {
	
	
	public static boolean isPrime(int num) {
		int count =0;
		for (int i = 1; i <num; i++) {
			if(num % i ==0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		
		
		int length = scan.nextInt();
		
		int[] arr = new int[length];
		for (int i = 0; i <length; i++) {
			arr[i] = scan.nextInt();
		}
		int count = 0;
		for (int i = 0; i<length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		System.out.println("집계된 소수의 개수"+ count);
		
		for (int i = 0; i<length; i++) {
			if (isPrime(arr[i])) {
			System.out.println(arr[i]);
			}
		}
	}
}
