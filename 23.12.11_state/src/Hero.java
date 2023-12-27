
public class Hero {
	private String name;
	private int attk;
	
	public Hero(String name,int attk) {
		this.name=name;
		this.attk=attk;
	}
	public String getName() {
		return name;
	}
	public int getAttk() {
		return attk;
	}
	
	public void goAttk(int attk) {
		this.attk= attk;
	}
	
	
	
}
