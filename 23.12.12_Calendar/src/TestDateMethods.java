import java.util.Calendar;

public class TestDateMethods {

	public static void main(String[] args) {
		// 현재 시간을 가지는 Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_MONTH, 13);

		cal.set(2023, Calendar.DECEMBER, 13);
		int dayofw = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayofw == Calendar.WEDNESDAY);

		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		// Calendar 월0~11
		int month = cal.get(Calendar.MONTH);
		
		// 해당월의 마지막 날짜
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);

	}

}
