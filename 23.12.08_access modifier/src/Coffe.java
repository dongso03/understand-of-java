
public class Coffe {

	private void readyCoffe() {
		System.out.println("원두준비");
	}
	
	private void boilWater() {
		System.out.println("물 끓임");
	}
	private void comCoffe() {
		System.out.println("커피완성");
	}
	public void process() {
		readyCoffe();
		boilWater();
		comCoffe();
	}
}
