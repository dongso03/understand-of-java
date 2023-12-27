public class TestDoll {

	public static void main(String[] args) {

		Doll d1 = new Doll("처기",15000);
		Doll d2 = new Doll("재욱",25000);
				
				DollFactory  fac = new DollFactory();
				Doll h = fac.createDoll(1);
				Doll c = fac.createDoll(2);
				Doll a = fac.createDoll(3);
			
				Doll n = fac.createDoll(-1);
				if(n != null) {
					System.out.println(n.getModel());
				}
				
			System.out.println(h.getModel());
			System.out.println(c.getModel());
			System.out.println(a.getModel());
	}

}
