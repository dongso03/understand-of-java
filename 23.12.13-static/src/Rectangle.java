
public class Rectangle {
	int wid;
	int hei;
	static int count;
	
	public Rectangle(int wid, int hei) {
		this.wid= wid;
		this.hei = hei;
		count++;
	}
	
	public static void main(String[] args) {
		System.out.println(Rectangle.count);
		Rectangle r = new Rectangle(100, 200);
		System.out.println(Rectangle.count);
		Rectangle r2 = new Rectangle(200, 400);
		System.out.println(Rectangle.count);
		Rectangle r3 = new Rectangle(300, 500);
		System.out.println(Rectangle.count);
	}
}
