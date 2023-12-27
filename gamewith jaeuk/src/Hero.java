
public class Hero {
	private int heroAttack; // 공격
	private int heal; // 회복
	private int heroHP;// 영웅체력

	public Hero(int heroAttack, int heal, int heroHP) {
		
			this.heroAttack = heroAttack;
			this.heal = heal;
			this.heroHP = heroHP;
		

	}

	
	public int getAttack() {
		return heroAttack;
	}

	public int getHeal() {
		return heal;
	}

	public int getHeroHP() {
		return heroHP;
	}

	public void setHeroHP(int heroHP) {
		this.heroHP=heroHP;
	}
	
	public void goDamage(Monster monster) {
		int a = monster.getMonsterHP();
		a -= heroAttack;
		monster.setMonsterHP(a);
	}
	public void goHeal(Hero hero) {
		int b = hero.getHeroHP();
		b += heal;
		hero.setHeroHP(b);
	}
	

}
