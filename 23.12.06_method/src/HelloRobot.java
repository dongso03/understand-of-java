// 클래스에 회수를 정수값으로 전달 받아 
// 안녕을 콘솔에 회수만큼 출력하는 메소드 작성
// 실행시킬때마다 몇번시켯는지 확인
public class HelloRobot {

	int count;
	
	public void rob(int a) {
		
		for (int i = 0; i <= a; i++) {
			System.out.println("안녕");
		}
		count += a;
	}
}
