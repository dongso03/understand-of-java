public class Rectanglego {

	public static void main(String[] args) {
		// 사각형의 생성자를 정의한 경우, 기본 생성자가 x
		//Rectangle r = new Rectangle();
		//r.x= 10;
		//r.y =10;
		//r.wid = 20;
		//r.hei = 30;
		
		Rectangle r2 = new Rectangle(10,10,20,30);
		System.out.println(r2.x);
		System.out.println(r2.y);
		System.out.println(r2.wid);
		System.out.println(r2.hei);
		
		Rectangle r3 = new Rectangle(13,23);
		System.out.println(r3.x);
		System.out.println(r3.y);
		System.out.println(r3.wid);
		System.out.println(r3.hei);
		
		Rectangle r4 = new Rectangle(40,15);
		
	}

}
