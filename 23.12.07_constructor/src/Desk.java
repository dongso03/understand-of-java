// 책상
// 모델명 스트링
// 가격 인트
// 높이조절여부 부련

// 생성자 정의 
// (스트링 모델명 , 인트 가격 , 부련 높이조절여부) 모든필드 초기화 
// (모델명, 가격) 두개만 초기화  << 높이조절 여부 트루
public class Desk {
	String name;
	int price;
	boolean hei;
	
	public Desk(String n, int p, boolean h) {
		name = n;
		price = p;
		hei = h;
		System.out.println("3개 파라미터 전달받는 생성자로 생성되고 모든필드 초기화");
	}
	public Desk(String n, int p) {
		name = n;
		price = p;
		hei = true;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(hei+ "\n");
		
	}
}
