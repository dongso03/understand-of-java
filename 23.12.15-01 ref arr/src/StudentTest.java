// 학생 국.영.수

// 학급 3명의 학생
// 학급 전체의 평균 출력
// 학급 전체 인원의 국,영,수 출력
public class StudentTest {
	public static void main(String[] args) {
		SClass c = new SClass(
				new Student[] { new Student(80, 80, 60), new Student(90, 80, 90), new Student(80, 70, 80) });
	c.printAllScores();
	c.printTotalAVG();
	
	}
}
