//책
// 제목, 출판사,가격, 작가이름

public class Book {

	String title;
	String publisher;
	int price;
	String authourName;

	public Book(String title, String publisher, int price, String authourName) {
		this.title =title;
		this.publisher =publisher;
		this.price= price;
		this.authourName= authourName;
	}
	//설정자(setter)
	public void setPrice(int price) {
		this.price= price;
	}
	
	// 접근자(getter)
	public int getPrice() {
		return price;
	}
	public static void main(String[] args) {
		Book b = new Book("파워자바", "인피니티", 25000, "강재욱");
		System.out.println(b.getPrice());
		
		b.setPrice(15000);
		System.out.println(b.getPrice());
	}
}
