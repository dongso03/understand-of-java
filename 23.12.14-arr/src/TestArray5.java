// 문자 배열을 전달 받아 모든 원소를 출력하는 정적 메소드 구현
public class TestArray5 {
	public static void printAllElement(char[] array) {
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	
	public static void main(String[] args) {
		char[] test = new char[] {'t', 'e','s','t'};
		printAllElement(test);
		
		printAllElement(new char[] {'g','i','r','a'});
	
		}
	}

