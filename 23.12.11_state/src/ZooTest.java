
public class ZooTest {
	public static void main(String[] args) {
		Zoo feed = new Zoo(100, 100);

		lion lion = new lion(feed);
		Hippo hippo = new Hippo(feed);

		lion.eatFeed(feed);
		lion.eatFeed(feed);
		System.out.println(feed.getmeat());

		hippo.eatFeed(feed);
		System.out.println(feed.getHay());
	}
}
