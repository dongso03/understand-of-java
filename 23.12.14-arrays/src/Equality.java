import java.util.Arrays;

public class Equality {
	public static void main(String[] args) {
		int[] left = {1,2,3,4};
		int[] right = {1,2,3,4};
		
		// 길이가 같고
		// 각인덱스의 원소의 값드리 같은지
		System.out.println(Arrays.equals(left, right));
	}
}
