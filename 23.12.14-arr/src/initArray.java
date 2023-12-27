
public class initArray {
	public static void main(String[] args) {
		// 연속된 int 자료를 표현하고자 한다
		// 5개의 int 정보를 가질수 있는 배열 선언.
		int[] arr = new int[5];
		
		// 각 인덱스로 접근하여, 순서대로 원소(element)를 2,4,6,8,10으로 초기화
//		arr[0] = 2;
//		arr[1] = 4;
//		arr[2] = 6;
//		arr[3] = 8;
//		arr[4] = 10;
//		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(i+1)* 2;
			System.out.println(arr[i]);
		}
		
	}
}
