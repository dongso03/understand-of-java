import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendar2 {
	public void yaho() {
		
	}
	
	
	
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      Calendar cal = Calendar.getInstance();
      
      System.out.println("년월 입력");
       int year = scan.nextInt();
        int month = scan.nextInt();

      System.out.printf("%d년 %d월\n", year, month);
      System.out.println("  일   월   화   수   목   금   토");

      cal.set(year, month - 1, 1);

      int start = cal.get(Calendar.DAY_OF_WEEK);

      for (int i = 1; i < start; i++) {
         System.out.print("   ");
      }

      for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
         System.out.printf("%3d", i);
         if (start % 7 == 0) {
            System.out.println();
         }
         start++;
      }
   }
}

