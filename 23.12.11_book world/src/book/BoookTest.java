package book;
public class BoookTest {

	public static void main(String[] args) {
		Author chun = new Author("천인국", "chun@naver.com");
		Author goo = new Author("구멍가게 코딩단", "goo@gmail.com");
		Book b1 = new Book("파워자바",25000,chun);
		Book b2 = new Book("파워파이썬",22000,chun);
		Book b3 = new Book("스프링웹프로젝트",30000,goo);
		
		//b1.print1();
		
		
		Author a = b1.getAuthor();
		System.out.println(a.getName());
		System.out.println(b3.getAuthorName());
		System.out.println(b1.getAuthorEmail());
		
		System.out.println(b1.getAuthor() == b2.getAuthor());
		System.out.println(b1.getAuthor() == b3.getAuthor());
		
	}

}
