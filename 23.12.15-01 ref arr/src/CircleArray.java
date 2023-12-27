//2차원 평면의 좌표 x,y

//원 ,반지름
//2차원 평면상에 중심점(x,y)

// 원여러개
//(x:10,y:10) 반지름:5
public class CircleArray {
	public static void main(String[] args) {
		Circle[] cArr = new Circle[] {
				new Circle(10,10,5)
				,new Circle(10, 15,7)
				,new Circle(20, 20,9)
				,new Circle(21, 20,9)};
		
		
		
		for (Circle elem : cArr) {
			System.out.println((elem.toString()));
		}
	}
}
