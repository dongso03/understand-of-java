
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(2023, 12, 8);

		boolean result = d.setMonth(0);
		System.out.println(result);

		d.setYear(2034);
		System.out.println(d.getYear());
		d.setMonth(15);
		System.out.println(d.getMonth());
	}

}
