
public class Monster {
	private int HP;
	
	public Monster(int HP) {
		this.HP = HP;
	}
	public int getHP() {
		return HP;
	}
	
	public void attkResult(Hero hero) {
		HP - hero.goAttk(30);
	}
	
	
}
