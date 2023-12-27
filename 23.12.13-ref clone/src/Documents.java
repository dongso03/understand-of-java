
public class Documents {
	private String name;
	private int day;
	private String sum;
	private int rank;
	
	
	public Documents(String name, int day, String sum, int rank) {
		super();
		this.name = name;
		this.day = day;
		this.sum = sum;
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}
	
	
}
