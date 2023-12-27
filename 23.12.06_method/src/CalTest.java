public class CalTest {
	public static void main(String[] args) {
		MyCal cal = new MyCal();
		
		cal.plus(100, 200);
		int min = cal.minus(400, 500);
		
		int range = cal.sumFromZ(50);
		System.out.println(range);
		
		System.out.println(cal.plus(100,200));
		System.out.println(min);
	}
}
