public class ToolTest {
	public static void main(String[] args) {
		MyTool my = new MyTool();
		my.doNothing();
		my.doReturn();
		int value = my.getOne();
		//double pi = my.PI();// 이줄없이
		System.out.println(my.PI());
		
		System.out.println(value);
		System.out.println("프로그램종료");

	}
}
