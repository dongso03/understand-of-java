public class BankAccountGo {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		System.out.println(b.don);
		
		BankAccount b2 = new BankAccount(2000);
		System.out.println(b2.don);
		b2.deposit(5000);
		System.out.println(b2.don);
		b2.withdraw(20000);
		System.out.println(b2.don);
	
		BankAccount b3 = new BankAccount(-2000);
		System.out.println(b3.don);
	}

}
