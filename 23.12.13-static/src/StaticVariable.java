
public class StaticVariable {
	int num = 300;
	static int yournum = 500; //정적 변수
	
	public static void main(String[] args) {
		StaticVariable a = new StaticVariable();
		System.out.println(a.num);
		
		System.out.println(StaticVariable.yournum);
	}
}
