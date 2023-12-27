


public class Login {
	private User[] users;

	public Login (User[] users) {
		this.users = users;
	}
	
	public boolean contain(String id, String pw) {
		for(int i = 0; i <users.length; i++) {
			if (users[i].matches(id, pw)) {
				return true;
			}
		}
		return false;
	}
}
