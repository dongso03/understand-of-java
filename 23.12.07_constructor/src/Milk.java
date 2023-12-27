//상품명
//제조일>> 변경 x
public class Milk {

	String productName;
	final String productDate; // >> 객채마다 고유값을 줄수있다.
	
	public Milk(String productName, String productDate) {
		this.productName = productName;
		this.productDate = productDate;
	}
	
	public static void main(String[] args) {
		Milk m = new Milk("부산우유","23.12.07");
		System.out.println(m.productDate);
		
		Milk m2 = new Milk("서울우유","23.11.27");
		System.out.println(m2.productDate);
	}
}
