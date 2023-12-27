public class HelloRobotTest {
	public static void main(String[] args) {
		HelloRobot go = new HelloRobot();
		go.count = 0;
		go.rob(6);
		go.rob(5);
		go.rob(6);
		
		System.out.println(go.count);
	

	}
}
