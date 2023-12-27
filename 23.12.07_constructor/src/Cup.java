// 색상 용량 손잡이 유무
// 모든필드 초기화 생성자
// 색상만 전달받아 초기화 하는 생성자.(용량값은 200 , 손잡이 없음)

public class Cup {

	String color;
	int contain;
	boolean isgrap;
	
	public Cup(String color) {
		this(color, 200, false);
	}
	public Cup(String color, int contain, boolean grap) {
		this.color = color;
		this.contain =contain;
		this.isgrap = grap;
	}
	
	public void printAll () {
		System.out.println(color);
		System.out.println(contain);
		System.out.println(isgrap);
	}
	public static void main(String[] args) {
		Cup c = new Cup("빨간색");
		c.printAll();
	}
}
 