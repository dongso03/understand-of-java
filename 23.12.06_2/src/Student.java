// 학생을 표한한 클래스
// 국,영,수,이름
// 자신의 이름을 출력하는 메소드 
// 자신의 총점을 출력하는 메소드
// 자신의 이름과 총점을 모두 출력할수 있음.
public class Student {

	int kor;
	int eng;
	int math;
	String name;

	public void name() {
		System.out.println("제이름은 " + name);
	}

	public void sume() {
		System.out.println("국영수총점" + (kor + eng + math));
	}

	public void total() {
		name();
		sume();  
		
	}
}