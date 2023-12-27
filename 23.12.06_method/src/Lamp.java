// 램프
// 상태: 불이켜져있음 또는 꺼져있음
// 동작: 불으 ㄹ껏다 / 켯다.
public class Lamp {
	boolean on;
	public void button() {
		on = !on;
	}
	public void print() {
		if (on) {
			System.out.println("켜저있다");
		} else {
			System.out.println("꺼져잇다");
		}
	}
}
