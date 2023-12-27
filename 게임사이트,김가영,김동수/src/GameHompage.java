

import java.util.Scanner;

public class GameHompage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		Login login = new Login(new User[] { new User("dong", "aaa11")
											, new User("ga", "bbb22") });

		System.out.println("아이디를 입력하세요.");
		String id = scan.nextLine();

		System.out.println("비밀번호를 입력하세요.");
		String pw = scan.nextLine();
		User user = new User(id,pw);
		
		if (login.contain(id, pw)) {
			System.out.println("로그인 성공.");
			// 로그인 성공시 회원에 따라 메시지 출력
			User.printUser(user);
			Homepage.playGame();

		} else {
			System.out.println("없는 회원입니다.");
		}

	}
}

