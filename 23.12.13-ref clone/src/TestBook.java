// 책을 4권 보관할수있는 책장에
// ㅠㅏ워자바,20000
// 파워자바의 복사본
// 스프링,25000
// 비어있음

public class TestBook {
	public static void main(String[] args) {
		BookShelf bsf = new BookShelf();
		Book powerJava = new Book("파워자바", 20000);
		
		bsf.setBook1(powerJava);
//		bsf.setBook2(powerJava);
		bsf.setBook2(CopyWriter.shallowCopy(powerJava));
		
		Book book1 = bsf.getBook1();
		//book1.setTitle("파워를자바라");>>첫번째 책제목을 바꿔도 2번째책은변하지않는다 위세터설정덕분에
		Book book2 = bsf.getBook2();
		System.out.println(book2.getTitle());
		
		Book book3 = new Book("스프링", 25000);
		bsf.setBook3(book3);
		
		bsf.setBook3(null);
		
		bsf.setBook4(book3);
	}
}
