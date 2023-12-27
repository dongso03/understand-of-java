
public class lion {

	private Zoo meat;

	public lion(Zoo meat) {
		this.meat = meat;
	}

	public void eatFeed(Zoo meat) {
		meat.decreasemeat(10);
	}
}
