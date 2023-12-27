import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] num = {2,3,4,5};
		
		System.out.println(Arrays.toString(num));
		
		int[] copy = Arrays.copyOf(num, 3);
		System.out.println(Arrays.toString(copy));
		
		// 값을 늘리게되면 임의의값 0 을 넣어준다.
		int[] copy2 = Arrays.copyOf(num, 5);
		System.out.println(Arrays.toString(copy2));
	
		
	}
}
