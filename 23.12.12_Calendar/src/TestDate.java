import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 정적 메소드 호출 >>문자가 기울어져있는게 보인다.
		System.out.println(cal.getTime());
		
		
		SimpleDateFormat kr = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
		String result = kr.format(cal.getTime());
		System.out.println(result);
	}

}
