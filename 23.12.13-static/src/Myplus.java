
public class Myplus {
	public int plus(int a, int b) {
		return a+b;
	}
	
	public static int staticPlus(int a , int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Myplus my = new Myplus();
	//	int re = my.plus(100, 200);
	//	int re = my.staticPlus(100, 200);
		
		
		//JVM Class Load
		int re  = Myplus.staticPlus(100, 200);
		// Myplus.plus(100,200); >>컴파일에러
		System.out.println(re);
	}
}
