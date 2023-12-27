import java.time.LocalDate;

public class TestLocalDate {
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	
	System.out.println(now.toString());
	
	int year = now.getYear();
	int mont = now.getMonthValue();
	int day = now.getDayOfMonth();
	System.out.println(year);
	
	//기존날짜를 기준으로 생성
	LocalDate thisMonthFistDay = now.withDayOfMonth(1);
	System.out.println(thisMonthFistDay);
	
	//특정 날짜 인스턴스 생성
	LocalDate nexDay = LocalDate.of(2023, 12, 13);
	LocalDate christMas = LocalDate.parse("2023-12-25");
	
	//기존날짜를 기준으로 생성
	LocalDate twoDayafter = now.plusDays(1);
	System.out.println(twoDayafter);
	
	//요일(월요일1 ~ 일요일7)
	int dayOfWeek = now.getDayOfWeek().getValue();
	System.out.println(dayOfWeek);
	
	int length = now.lengthOfMonth();
	System.out.println(length);
}
}
