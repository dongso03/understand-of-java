public class Circletest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 5;
		c.printArea();
//		System.out.println("c 객체(원 타입)의 넓이" + 
//		c.radius * c.radius * c.PI);

		// 반지름이 7인 원넓이

		c.radius = 7;
		// 상수이기에 컴파일에러남 >> c.PI = 2342.23;
	//	System.out.println("c 객체(원 타입)의 넓이" + 
	//	c.radius * c.radius * c.PI);
		c.printArea();
	}

}
