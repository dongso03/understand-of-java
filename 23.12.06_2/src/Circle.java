// 원을 표현할수 있는 클래스
// 반지름
// 파이
public class Circle {
	double radius;
	final double PI = 3.14;
	
	public void printArea() {
		double area = radius * radius * PI;
		System.out.println(area);
	}
}
