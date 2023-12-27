//캔음료 자판기
//콜라2000
//사이다 1800
//솔의눈 2200
//모든 메뉴의 상품명 출력
// 특정 캔의 가격 출력
public class CanDrinkArray {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		vm.printNames();
		vm.printPrice(-2);
	}
}
