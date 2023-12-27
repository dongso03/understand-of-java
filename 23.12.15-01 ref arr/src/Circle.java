
public class Circle {
	private CirclePoint center;
	int radius;
	
	public Circle(int x, int y, int radius) {
		center= new CirclePoint(x,y);
		
		this.radius = radius;
	}

	public String toString() {
		return "x:" + center.getX() +",y:" +center.getY() +" 반지름 :"+radius;
	}
	
	public CirclePoint getCenter() {
		return center;
	}

	public void setCenter(CirclePoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	
}
