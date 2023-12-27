// 책 4권을 보관하고 있는 책장에
// 파워자바 , 20000 원 4권 보관중
// 스프링,25000원 구입했음.

// 파워자바 3권 절반가격에 ㅍㅍ
// 얻은수익을 책장에 비상금으로 숨겨둠.
public class TestCarrot {
	public static void main(String[] args) {
		BookShelf bsf = new BookShelf();
		Book powerJava = new Book("파워자바", 20000);

		bsf.setBook1(powerJava);
		bsf.setBook2(powerJava);
		bsf.setBook3(powerJava);
		bsf.setBook4(powerJava);

		bsf.setBook2(null);
		bsf.setBook3(null);
		bsf.setBook4(null);
		int price = powerJava.getPrice() / 2;
		int income = price * 3;
		
		bsf.setMoney(income);
		
		Book spring = new Book("스프링",25000);
		
		bsf.setMoney(bsf.getMoney() - spring.getPrice());
		bsf.setBook2(spring);
	}
}
