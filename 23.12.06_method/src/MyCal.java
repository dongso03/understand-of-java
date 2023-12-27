
public class MyCal {
	// () >> 파라미터 
	// () >> 파라미터가 비어있는경우
	// (자료형과 이름) >> 파라미터 1개
	// (자료형과 이름1, 자료형 이름2) >> 파라미터 2개
	public int plus(int l, int r) {
		int sum = l + r;
		return sum;
	}
	// 차를구해 반환하는 메소드
	// 큰수에서 작은수를 뺌
	public int minus(int a, int b) {
		if (a > b) {
		return a-b;
		} else {
			return b-a;
		}
	}
	
	// 0 부터 파라미터로 입력받은 정수까지의 합을 봔한하는 메소드
	public int sumFromZ(int to) {
		int sum = 0;
		for (int i = 0; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
}
