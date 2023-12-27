import java.io.ObjectInputStream.GetField;

public class TestClone {
	public static void main(String[] args) {
		Toy toy1 = new Toy(1000);
		// Toy toy2 = toy1; //>>이건 참조 복사가일어난거다

		Toy toy2 = new Toy(toy1.getPrice()); // 객체 복사(clone)>>원래값을 그대로 가져올때

		Box box = new Box(5, toy1);
		// shallow copy
		Box shallow = new Box(box.getSize(),box.getToy());
		// deep copy
		Box deep = new Box(box.getSize(), new Toy(toy1.getPrice()));
		
		System.out.println(box == shallow);
		System.out.println(box.getToy() == deep.getToy());
		System.out.println(box.getToy() == shallow.getToy() );
		System.out.println(box.getToy().getPrice() == deep.getToy().getPrice());
	}
}
