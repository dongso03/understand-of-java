public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "동수";
		h.age = 22;
		h.sayHello();
		
		h.age = 22;
		
		Human h2 = new Human();

		h2.sayHello();
		h2.name = "재욱";
		// 순서바뀌면 왜안나올까
		// 값이 정해진 순서가 바뀌어서 
		
		System.out.println("종료");
	}
}
