public class CarTest {
	public static void main(String[] args) {
		Car go = new Car();
		go.speed = 10;
		go.fast(30);
		
		go.slow(20);
		System.out.println(go.speed);
	}
}
