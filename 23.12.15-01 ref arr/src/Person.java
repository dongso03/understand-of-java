
public class Person {
	private String name;
	private int ages;
	public Person(String name, int ages) {
		super();
		this.name = name;
		this.ages = ages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(ages);
	}

}
