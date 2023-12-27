import java.util.Scanner;

//2. 분포도 (히스토그램)
// - 사용자에게 1 ~ 100 사이의 정수를 10번 입력받아서
//   각 범위의 수의 분포를 보여줄 수 있는 프로그램
//   입력예) 1 5 9 7 15 20 30 41 49 50
//   출력예)
//        1 ~ 10) ****
//       11 ~ 20) **
//       21 ~ 30) *
//       31 ~ 40)
//       41 ~ 50) **
//		.....
//       81 ~ 90)
//       91 ~ 100)
public class Histogram {
	public static void main(String[] args) {
		int[] arr = new int[101];
		Scanner scan = new Scanner(System.in);
		int count = 0;

		for (int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if (input >= 1 && input <= 100) {
				arr[input]++;
				
			}
		}
		for (int i = 1; i <= 10; i++) {
            int a = (i - 1) * 10 + 1;
            int b = i * 10;
            System.out.printf("%3d ~ %3d) ", a, b);
            
            for (int j = a; j <= b; j++) {
                System.out.print(arr[j] > 0 ? "*" : "");
            }
            System.out.println();
        }
    }
}