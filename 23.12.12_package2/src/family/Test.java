package family;


public class Test {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("문자열");
	sb.append(true);
	sb.append(30);
	sb.append("zzz");
	
	// 스트링 빌더가 만들고 있는 물자열을 뒤집는 메소드를 찾아 호출
	sb.reverse();
	
	String res = sb.toString();
	System.out.println(res);
}
}
