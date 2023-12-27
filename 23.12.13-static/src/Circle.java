import java.util.Calendar;

public class Circle {
	int radi;
	public final static double PI = 3.14;

	public Circle(int radi) {
		this.radi = radi;
	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(9);
		
		System.out.println(Math.PI);
		
//		Circle.pi = 4.4444;
		
		System.out.println(Calendar.YEAR);
	}
}
