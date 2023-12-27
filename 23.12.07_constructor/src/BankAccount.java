//은행계좌
// 잔고:
//잔고를 0으로 초기화하는 기본생성자
// 잔고값을 파라미터로 전달받아 초기화 하는생성자
public class BankAccount {
	int don;
	public BankAccount() {
	}
	
	public BankAccount(int b) {
		if (b <0) {
		don = 0;
		System.out.println("마이너스 계좌를 만들수 없어 , 잔고를 0으로 설정하였습니다.");
		} else {
		don = b;
		}
	}
	
	public void deposit(int amount) {
		don += amount;
	}
	public void withdraw(int amount) {
		if (amount <0 ) {
			return;
		}
		if (don >= amount) {
			don -= amount;
		} else {
			System.out.println("잔고부족,출금진행 안됨");
		}
		
	}
}
