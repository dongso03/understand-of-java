public class CarTest3 {

	public static void main(String[] args) {
		Car go1 = new Car();
		go1.speed = 0;
		go1.fast(10);
		
		Car go2 = new Car();
		go2.speed = 20;
		go2.fast(50);
		
		Car go3 = new Car();
		go3.speed = 60;
		go3.fast(30);
		
		System.out.println(go1.speed);
		System.out.println(go2.speed);
		System.out.println(go3.speed);
	}

}
