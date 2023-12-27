
public class Pen {
	public void writeConsole() {
		System.out.println("펜은 콘솔에 글자를 적을수 있음");
	}
	//메소드 오버로딩됨 위메소드랑 ㅇㅇ
	public void writeConsole(String text) {
		System.out.println(text +"를 적음");
		System.out.println(text.length() +"자를 적음");
	}
	public void writeConsole(int num) {
		System.out.println(num +"번 먹고싶다");
	}
	
	
}
