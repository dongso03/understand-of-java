
public class Student {

	String name;
	String gender;
	int age;
	int score;

	public Student(String name, String gender, int age, int score) {
		this.name = name;
		this.gender= gender;
		this.age = age;
		this.score= score;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(score);
	}

	public static void main(String[] args) {
		Student s = new Student("재욱", "여자", 98, 100);
		s.printAll();
		
		Student s2 = new Student("재숙", "남자", 18, 100);
		s2.printAll();
	}
}