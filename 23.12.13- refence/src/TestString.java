
public class TestString {
	public static void main(String[] args) {
	
		//문자열은 "불변"의 객체이다.
		// Stringpool에 보관된다.
		String origin = "원본문자열";
		String sameValue = "원본문자열";
		String sameRef = origin;
		
		System.out.println(origin == sameValue);
		System.out.println(origin == sameRef);
		
		
		
		
		
		
		
		
		
		
		
		//Person p = new Person(10);
	//	Person sp = p;
		
		//Person anotherp = new Person(10);//<< garbage가 되버렸다.
		//System.out.println(p == sp);
		//System.out.println(p == anotherp);
		
		//anotherp = null; //참조를 잃어버린 인스턴스를 garbage라고 부른다
		//sp = null;
		
		//JVM. Garbage Collector
	}
}
