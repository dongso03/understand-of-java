
public class TestNull {
	public static void main(String[] args) {
	//	String s = null;
	//	String empty = "";
		
	//	String nonInit;
	//	System.out.println(nonInit);
		
	//	nonDecl= "값";
		//sysout
		
	//	System.out.println(empty.length());
		
		String s = null;
		//1.s값을 올바르게 초기화하는방법
		//s= "의도한 문자열값";
		
		//2. s의 참조가 올바를때만 접근함.
		if  (s != null){
		System.out.println(s.length()); // nullpointException
		}
	}
}
