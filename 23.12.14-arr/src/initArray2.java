
public interface initArray2 {
	public static void main(String[] args) {
		// long 타입의 배열 선언 및 초기화 (길이가 3인 인스턴스 생성)
		long[] arr = new long[3];
//		double 타입배열 길이4
		double[] arr2 = new double[4];
		String[] arr3 = new String[2];
		arr3[0] ="dm";
		// 길이값은 int 타입. 최대값 = int의 최대값. 음수도 안된다.0은 정상적 컴파일및실행가능하다 , 원소값은 가질수없다.
//		int[] arr3 = new int[321.213];
//		int[] arr4 = new int[-12];
		
		
		System.out.println(arr2.length);
//		arr2.length =5;  초기화된 배열 인스턴스의 길이는 변경x
	}
}
