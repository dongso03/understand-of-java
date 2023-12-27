package book;
//책제목
//가격
//작가명
//작가이메일
public class Book {

	private String title;
	private int price;
	private Author author;

	public Book(String title, int price,Author author) {
		this.title = title;
		this.price = price;
		this.author = author;
		
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author= author;
	}

	public String getAuthorName() {
		return author.getName();
	}
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	public void print1() {
		System.out.println(getAuthor().getName());
		System.out.println(getAuthor().getEmail());
		System.out.println(title);
		System.out.println(price);
	}

}
