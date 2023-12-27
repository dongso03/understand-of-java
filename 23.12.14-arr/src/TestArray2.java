
public class TestArray2 {
	public static void main(String[] args) {
		int[] arr = { 3, 44, 2, 15, 23, 36 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
