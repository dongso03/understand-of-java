package book;
//책장
//책3권
public class BookShelf {
	private Book book1;
	private Book book2;
	private Book book3;
	
	public BookShelf(Book book1,Book book2,Book book3) {
		this.book1=book1;
		this.book2=book2;
		this.book3=book3;
	}
	public static void main(String[] args) {
		BookFactory fac = new BookFactory();
		BookShelf bookshelf = new BookShelf(fac.createPowerJava()
				,fac.createPowerJava()
				,fac.createPowerJava());
	
	}
}
