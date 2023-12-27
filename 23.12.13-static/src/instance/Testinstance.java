package instance;

import java.time.LocalDate;

public class Testinstance {
	public static void main(String[] args) {
		Drink d = new Drink(1000);
		Drink way = d.createInstance();

		System.out.println(way.getPrice());
		
		Drink way2 = Drink.createInstance(2000);
		System.out.println(way2.getPrice());
	}
}
