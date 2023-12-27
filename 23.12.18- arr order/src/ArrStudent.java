import java.util.Arrays;

public class ArrStudent {
	public static void main(String[] args) {
		Student[] arr = new Student[] { new Student("길동", 50), new Student("둘리", 100), new Student("도우너", 70) };
		
		// 대소비교 양수 음수 0
		int result = "문자열".compareTo("abc");
		System.out.println(result);
		
		
		Arrays.sort(arr, new StudentNameComparator());
		
		for(Student s : arr) {
			System.out.println(s.getName());
			System.out.println(s.getScore());
			System.out.println("---");
		}
	}
}
