// 커피가격 인트
// 판매량 인트
// 생성자(int) : 커피가격 초기화, 판매량(기본값0)
// void 판매량 증가
// int 총매출()
public class CoffeeStore {
	int coffeprice;
	int coffeamount;
	int total;
	
	public CoffeeStore(int p) {
		coffeprice = p;
	}

	public void CoffIncrease(int a) {
		coffeamount += a;
}
	public int total() {
		total = coffeprice * coffeamount;
		return total;
	}
	public void printAll() {
		System.out.println("커피가격: "+ coffeprice);
		System.out.println("판매한 개수: " +coffeamount);
		System.out.println("총매출: " + total);
	}
}
