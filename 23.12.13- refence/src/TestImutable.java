import java.time.LocalDate;

public class TestImutable {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bookDay = today;
		
		bookDay = bookDay.plusDays(30);
		
		System.out.println(bookDay);
		System.out.println(today);
	}

}
