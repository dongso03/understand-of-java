public class Person {
	private int hei;
	private int wei;

	public Person(int hei, int wei) {
		super();
		this.hei = hei;
		this.wei = wei;
	}

	public int getHei() {
		return hei;
	}

	public void setHei(String name) {
		this.hei = hei;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	public void printAll() {
		System.out.println(hei);
		System.out.println(wei);
	}

}
