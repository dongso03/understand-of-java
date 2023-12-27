
public class CopyArray2 {
	public static void main(String[] args) {
		int[] num = new int[] { 20, 22, 26, 30 };

		// 위의 배열에서 앞 2개만 원소로 가지는 배열생성;
		int[] copy = new int[2];

		for (int i = 0; i < copy.length; i++) {
			copy[i] = num[i];
			System.out.println(copy[i]);
		}
		// e뒤에 두개만 가지는 배열 생성
		int[] rev = new int[2];
		for (int i = 0, j = num.length-1; i < rev.length; i++, j--) {
			rev[i] = num[j];
			System.out.println(rev[i]);
		}
	}
}
