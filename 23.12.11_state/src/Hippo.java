
public class Hippo {
	private Zoo hay;

	public Hippo(Zoo hay) {
		this.hay = hay;
	}

	public void eatFeed(Zoo hay) {
		hay.decreasehay(30);
	}
}
