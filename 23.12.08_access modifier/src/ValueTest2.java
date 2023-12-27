// myinbox  둘다  i를 참조하기때문에  밑에 클래스가 실행되고 사라져도 11이됨
public class ValueTest2 {
	public void increase(MyIntBox m) {
		m.i++;
	}
	
	public static void main(String[] args) {
		MyIntBox m = new MyIntBox();
		m.i = 10;
		
		ValueTest2 t = new ValueTest2();
		// call by value로 참조값의 복사
		t.increase(m);
		
		System.out.println(m.i);
	}
}
