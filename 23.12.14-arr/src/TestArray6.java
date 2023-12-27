
public class TestArray6 {
// 입력 받은 길이 만틈으 ㅣ정수를 가지는 배열 생성하여 반환하는 정적 메소드
	// 원소의 값은1,2,3...
	public static int[] arrayIndex(int length) {
		int[] arr = new int[length];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = i +1;
		}
		return arr;
	}
	
	// 정수와 길이값을 입력 받아, 정수의 배수를 길이값만큼 가지는 배열을 생성및 반환하는 정적메소드
	public static int[] createNA(int num,int length) {
		int[] arr = new int[length];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = num * (i+1);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] res = arrayIndex(4);
		System.out.println(res.length);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		int[] res2 = createNA(2, 10);
		for (int i = 0; i < res2.length; i++) {
			System.out.println(res2[i]);
		}
	}
}
