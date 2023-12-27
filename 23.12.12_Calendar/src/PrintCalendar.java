import java.time.LocalDate;
import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LocalDate now = LocalDate.now();

		System.out.println("년,월,일을 각각 입력하세요");
		int inputy = scan.nextInt();
		int inputm = scan.nextInt();
		int inputd = scan.nextInt();

		LocalDate inputDate = LocalDate.of(inputy, inputm, inputd);
		int fdw = inputDate.withDayOfMonth(1).getDayOfWeek().getValue();
		int ldm = inputDate.lengthOfMonth();

		System.out.println("    " + inputDate);
		System.out.println("   일    월   화    수   목   금    토");

		int a = 1;
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 && j <= fdw) {
					System.out.print("   ");
				} else if (a <= ldm) {
					System.out.printf("%3d", a);
					a++;
 
 
 				}
			}
			System.out.println();
			
			System.out.println("-------ฅ(๑°▽°๑)---------");
		}
	}
}
