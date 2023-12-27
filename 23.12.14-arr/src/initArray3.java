
public class initArray3 {
	public static void main(String[] args) {
		int num;
		num = 22;
		//초기화 하고자 하는 배열의 각 원소들의 값, 순서가 있는경우.
		int[] arr  = new int[] {30,40,50,60};
		
		for (int i =0;  i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {70,80,90};
		for (int i =0;  i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3;
//		arr3= {100,110,120};
		arr3 = new int[] {13,24,66,89};
		for (int i =0;  i <arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
