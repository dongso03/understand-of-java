// 동물
// 종
// 나이
// 체중

// 모든필드 초기화 생성자 각각 필드의 접근 설정자
public class Animal {

	private String spi;
	private int age;
	private double kg;
	
	public Animal(String spi,int age,int kg) {
		this.spi =spi;
		this.age = age;
		this.kg = kg;
	}
	
	public void setSpi(String spi) {
		this.spi =spi;
	}
	public String getSpi() {
		return spi;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public double getKg() {
		return kg;
	}
}
