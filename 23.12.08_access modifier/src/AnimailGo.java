
public class AnimailGo {

	public static void main(String[] args) {

			Animal a = new Animal("영장류", 7, 45);
			a.setSpi("외계종");
			System.out.println(a.getSpi());
			a.setAge(5);
			System.out.println(a.getAge());
			a.setKg(82.7);
			System.out.println(a.getKg());
	}

}
