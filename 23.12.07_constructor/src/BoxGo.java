
public class BoxGo {
	public static void main(String[] args) {

		Box b = new Box(-2, -3, -60);
		System.out.println("부피는:" + b.volume());

		
		b.setWid(50);
		System.out.println(b.getWidth());
	}

}
