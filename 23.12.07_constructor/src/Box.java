// 가로,세로,높이
// 모든 필드 초기화 생성자
// 부피를 구해 반환살수있는 메소드
// 음수입력시 양수로변환

public class Box {
	
	// 접근 제한자
	// private 외부의 모든 접근을 제한
	private int width;
	private int length;
	private int height;

	public int getWidth() {
		return width;
	}

	public int getleng() {
		return length;
	}

	public int gethei() {
		return height;
	}

	public void setWid(int width) {
		if (width >= 0) {
			this.width = width;
		}
	}

	public void setleng(int leng) {
		this.length = leng;
	}

	public void sethei(int hei) {
		this.height = hei;
	}

	public Box(int x, int y, int hei) {
		if (x > 0 && y > 0 && hei > 0) {
			this.width = x;
			this.length = y;
			this.height = hei;
		} else {
			System.out.println("음수를 강제로 양수로 바꿨습니다");
			this.width = (x > 0) ? x : -x;
			this.length = (y > 0) ? y : -y;
			this.height = (hei > 0) ? hei : -hei;
		}
	}
	// 접근제한자
	// public 모든 접근(가시성)을 허용
	public int volume() {
		return width * length * height;
	}

	public static void main(String[] args) {

		Box b = new Box(-2, -3, -60);
		System.out.println("부피는:" + b.volume());
		
		b.width = 300;
		System.out.println(b.width);
	}
}