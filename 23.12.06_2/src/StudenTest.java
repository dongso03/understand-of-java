
public class StudenTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.kor = 80;
		s.eng = 90;
		s.math = 82;
		s.name = "dongsu";
		
		s.name();
		s.sume();
		s.total();
	}
}
