public class ForEach {
	public static void main(String[] args) {
		int[] arr =new int[] {5,4,7,8};
		
		
		// 정순이다. 순환하는 배열의 원소 수정x
		for (int elem: arr) {
			System.out.println(elem);
		}
	}
}
