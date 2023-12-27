
public class TestArray4 {
	public static void main(String[] args) {
		char[] arr = { 'b', '가', 'e', '나', '5' };
		// 위의 문자 배열의 원소를 개행없이 정순 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 위의 문자배열에서 e문자의 인덱스 찾아 출력
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (ch == 'e') {
				System.out.println(i);
			}
		}
	}
}
