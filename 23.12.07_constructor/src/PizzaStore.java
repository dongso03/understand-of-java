//상호명 스트링
//주소 스트링
//번호 인트
// 대표자명 스트링
//기본 배달료 ??
//콤비네이션 피자 가격 인트
//치즈피자 가격 인트

public class PizzaStore {
	
	String storeName;
	String adress;
	String ceoName;
	int tel;
	int basicPrice;
	int comPizza;
	int cheezePizza;
	
	public PizzaStore(String storeName, String adress, String ceoName, int t, int b, int c, int h) {
	this.storeName = storeName;
	this.adress = adress;
	this.ceoName = ceoName;
	this.tel = t;
	this.basicPrice =b;
	this.comPizza = c;
	this.cheezePizza = h;
		
	}
	
	
}
