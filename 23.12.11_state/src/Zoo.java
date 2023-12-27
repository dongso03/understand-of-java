// 사료창고 클래스
// 사료의양:int
// 사자 클래스 
// 사료를 먹음(사료창고) :void
// 하마 클래스 
// 사료를먹음 (사료창고):void

public class Zoo {

	// 사료창고를 생성하고
	// 사자생성
	// 하마생성

	// 사자.사료를 먹음(사료창고) 호출
	// 하마.사료를 먹음(사료창고) 호출
	private int meat;
	private int hay;

	public Zoo(int meat, int hay) {
		this.meat = meat;
		this.hay = hay;
	}

	public int getmeat() {
		return meat;
	}

	public int getHay() {
		return hay;
	}

	public void decreasemeat(int amount) {
		meat -= amount;
	}

	public void decreasehay(int amount) {
		hay -= amount;
	}

}
