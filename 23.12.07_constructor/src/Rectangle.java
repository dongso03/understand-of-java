//2차원 평면상의 직사각형
// 좌표x,y
//가로,세로
public class Rectangle {
	int x;
	int y;
	int wid;
	int hei;

	public Rectangle(int newX, int newY, int w, int h) {
		x = newX;
		y = newY;
		wid = w;
		hei = h;
	}
	// 위랑같은데 구분될때>> Overload 가 나뉘었다.>> 파라미터의 자료형,개수,순서에따라서 오버로드를 찾아갈수있다
	public Rectangle (int w, int h) {
		x= 0;
		y = 0;
		wid = w;
		hei = h;
	}
}
