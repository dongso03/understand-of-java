public class StringArray {
	public static void main(String[] args) {
		String[] arr = new String[5];
		System.out.println(arr.length);
		
		arr[0] ="하이";
		arr[1] ="헬로우";
		arr[2] ="님 서폿머하심?";
		arr[3] ="아 그거맞음?";
		arr[4] ="15 ㄱ";
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(String str :arr) {
			System.out.println(str);
		}
		
		
		


	}
}
