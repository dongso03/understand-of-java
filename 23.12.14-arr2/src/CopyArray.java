
public class CopyArray {
	public static void main(String[] args) {
		int[] num = {20,22,26,30};
		
		// 원본 배열과 타입,길이,원소값, 순서가 같은 배열을 생성하기
		int[] copy = new int[num.length];
		
		for (int i = 0; i <num.length; i++) {
			copy[i] = num[i];
		}
		for (int i = 0; i <copy.length; i++) {
			System.out.println(copy[i]);
			
		}
		
		
		
//		int[] anotherRef = num;
//		
//		num[0] = 90;
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//		System.out.println();
//		for (int i = 0; i <anotherRef.length; i++) {
//			System.out.println(anotherRef[i]);
//		}
//		
	}
}
