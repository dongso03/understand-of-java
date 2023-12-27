import java.util.Arrays;

public class Sorting {
 static void insertionSort(int[] arr) {

		for (int index = 1; index < arr.length; index++) {

			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}

	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		int[] nums = { 10, 30, 20, 90, 70 };

		Sorting.insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
