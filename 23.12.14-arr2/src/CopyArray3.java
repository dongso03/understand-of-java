
public class CopyArray3 {
	public static void main(String[] args) {
		int[] num = new int[] { 20, 22, 26, 30 };
			// 위의 배열의 원소를 모두 가지는 길이가 6인 배열
		int[] extend = new int[6];
		for (int i = 0; i<extend.length; i++) {
			extend[i] = 100;
		}
		for (int i = 0; i< num.length; i++) {
			extend[i] = num[i];
			
		}
		for (int i = 0; i< extend.length; i++) {
			System.out.println(extend[i]);
		}
	}
}
