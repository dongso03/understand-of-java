import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hero h = new Hero(20, 20, 100);
        Monster m = new Monster(15, 80);

        int count = 0;
        int count2 = 0;
        boolean go = true;
        while (go) {
            System.out.println("1또는 2를 입력하시게");
            System.out.println("1번은 공격");
            System.out.println("2번은 힐링");
            int input = scan.nextInt();
            if (m.getMonsterHP() > 0) {
                if (input >= 1 && input <= 2) {
                    if (h.getHeroHP() > 0) {
                        if (input == 1) {
                            h.goDamage(m);
                            if (m.getMonsterHP() <= 0) {
                                System.out.println("몬스터 으앙 주금");
                                System.out.println("내가 쓴 턴은:" + count2);
                                System.out.println("새로운 몬스터가 나타났다!");
                                m.setMonsterHP(80);
                                count++;
                            } else {
                                m.goDamage2(h);
                                count2++;
                                System.out.println("몬스터체력은" + m.getMonsterHP());
                                System.out.println("영웅체력은" + h.getHeroHP());
                            }
                        } else if (input == 2) {
                            h.goHeal(h);
                            m.goDamage2(h);
                            count2++;
                            System.out.println("힐을해서 영웅체력이 올랐습니다");
                            System.out.println("몬스터체력은" + m.getMonsterHP());
                            System.out.println("영웅체력은" + h.getHeroHP());
                        }
                    } else {
                        System.out.println("영웅으앙주금");
                        go = false;
                    }
                } else {
                    System.out.println("1또는 2입력");
                }
            }
        }

        System.out.println("잡은 몬스터수는 " + count);
    }
}

