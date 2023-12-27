public class DeskGo {

	public static void main(String[] args) {
		Desk d = new Desk("좋은책상",2000,false);
		d.printAll();
		
		Desk d2 = new Desk("재욱책상",5000);
		System.out.println(d2.name);
		System.out.println(d2.price);
		System.out.println(d2.hei);
		
	}

}
