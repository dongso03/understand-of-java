
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(20);
		sb.append("원본");
		sb.append("추가");
		sb.append("구성");
		
		String re = sb.toString();
		System.out.println(re);
		
		
		
		// 이건 그냥 값이 바뀌는거다
		char c = 'a';
		c= 'b';
	}
}
