public class CanDrinkGo {

	public static void main(String[] args) {
		CanDrink n = new CanDrink();
		System.out.println(n.name);
		System.out.println(n.price);
		
		CanDrink coke = new CanDrink("콜라", 2000);
		System.out.println(coke.name);
		System.out.println(coke.price);
		CanDrink sprite = new CanDrink("사이다", 1900);
	}

}
