
public class Information {
	private String ID;
	private String PW;

	public Information(String a, String b) {
		super();
		this.ID = a;
		this.PW = b;
	}
	
	public boolean matches(String id , String pw) {
		
		return this.ID.equals(id)&& this.PW.equals(pw);
	}

	public String getA() {
		return ID;
	}

	public void setA(String a) {
		this.ID = a;
	}

	public String getB() {
		return PW;
	}

	public void setB(String b) {
		this.PW = b;
	}

}
