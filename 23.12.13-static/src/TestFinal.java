
public class TestFinal {
	public static int MINUS_ERROR = -100;
	public static int ZERO_ERROR = -200;
	
	public int divide(int num, int num2) {
		if(num >= 0 && num2 > 0) {
		return num /num2;
		}else if (num2 == 0) {
			return ZERO_ERROR;
		}else {
			return MINUS_ERROR;
		}
	}
	
	public static void main(String[] args) {
		TestFinal t = new TestFinal();
		
		 int res = t.divide(100, -10);
		 if (res == MINUS_ERROR) {
			 System.out.println("양수값을 입력하세요");
		 }
		
		if (t.divide(100, 0)== ZERO_ERROR) {
			System.out.println("0으로 나눌수 없다");
		}
	}
}
