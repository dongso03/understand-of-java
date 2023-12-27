public class MyTool {
	// 메소드 정의(head), 구현(body)
	// 정의 : 반환타입 이름
	// 구현 : 문장(들)
	public void doNothing() {

	}
	// void >> 반환값이 없음을 나타냄 공허의지팡이 마관달려있네
	public void doReturn() {
		System.out.println("hello");
		return;
		
		//System.out.println("hello");
	}
	// 메소드는 반환값이 있을수 있다.
	// 반환값이 있는 경우 메소드 정의 부분에 자료형을 명시해야함.
	public int getOne( ) {
		return 5;
	}
	// 파이 실수값을 반환할수 있는 메소드
	public double PI() {
		return 3.14;
	}
}
