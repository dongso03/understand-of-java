//영웅
// 직업: 검사,마법사,도적
// 공격력: int
// 공격한다(몬스터) {
// 몬스터의 체력이 공격력 만큼 줄어야된다.
// }
//몬스터
// HP: int


public class HeroAndMonster {
	public static void main(String[] args) {
		//영웅 한명을 생성
		Hero h = new Hero("재욱검사",30);
		// 몬스터를 생성
		Monster m = new Monster(100);
		
		System.out.println(h.getName());
		System.out.println("공력력: "+h.getAttk());
		
	
		
		
		
		
		// 영웅.공격(몬스터)
	}
}
