import java.util.Scanner;

//사용자 3명의 인적 정보를 
//입력 받아 출력하는 프로그램
public class PersonArray {
	public static void main(String[] args) {
//		String[] names = new String[3];
//		int[] ages = new int[3];

		Person[] p = new Person[3];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <p.length; i++) {
			System.out.println("사용자이름?");
			String name = scan.nextLine();
			System.out.println("사용자나이??");
			int age = scan.nextInt();
			scan.nextLine();
			
			p[i] = new Person(name, age);
		}
		
		for (int i = 0; i <p.length; i++) {
			p[i].printAll();
//			System.out.println(p[i].getName());
//			System.out.println(p[i].getAges());
		}
	}
}
