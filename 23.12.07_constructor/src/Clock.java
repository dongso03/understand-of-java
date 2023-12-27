//시계 
//시 
//분
//초
public class Clock {

	int hour;
	int minute;
	int second;

	public Clock(int hour) {
		this(hour, 0, 0);
	}

	public Clock(int hour,int minute) {
		this(hour, minute, 0);
	}

	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public static void main(String[] args) {
		Clock c = new Clock(10, 20, 30);
		Clock ten = new Clock(10);
		System.out.println(ten.hour);
		System.out.println(ten.minute);
		System.out.println(ten.second);
	}
}