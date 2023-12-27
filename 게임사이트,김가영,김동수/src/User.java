


public class User {

	private String id;
	private String pw;
	

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
		

	}

	public boolean matches(String id, String pw) {
		return this.id.equals(id) && this.pw.equals(pw);
	}
	

	static void printUser(User user) {
		// 아이디 비밀번호 일치하는지 확인
		// 문자열 비교에는 equals 메소드 사용
		if ("dong".equals(user.id) ) {
			System.out.println("안녕하세요 김동수님");
		} else if ("ga".equals(user.id) ) {
			System.out.println("안녕하세요 김가영님");
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
