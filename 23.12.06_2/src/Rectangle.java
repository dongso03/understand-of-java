// 사각형 클래스 정의
// 가로 ,세로 
// 넓이를 구해 콘솔에 출력 기능
public class Rectangle {

	int a;
	int b;

	public void printperimeter() {
		System.out.println("둘레는 " + 2 * (a + b));
	}

	public void rectangle() {
		int c = a * b;
		System.out.println("넓이는 " + c);
	}
}
