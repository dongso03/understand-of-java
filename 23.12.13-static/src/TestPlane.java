import java.util.stream.IntStream;

//비행기를 나타내는 plane 클래스 작성
// 비행기는
// 제작사(보잉, 에어버스 등의 값을 가짐
// 모델 명
// 최대승객수 

// 각 필드 정의및 private 접근 제한자 설정
// 퍼블릭 생성자및 게터 세터

// 생성자 정의
// (스트링,스트링,인트)
//(스트링,스트링) > int값 전달이 없을 경우, 최대 승객수는 250으로 
// main메소드를 포함한 테스트 클래스 객체 생성
// 생성된 인스턴스의 수를 나타낼수 있는 변수를 선언하고, 인스턴스생성시 1씩증가.
// 여러개의 인스턴스 생성후, 플레인카운트 값을 출력해서 확인

// 음속(
public class TestPlane {


	private String productCom;
	private String modelName;
	private int maxPassenger;
	private static int instanceCount = 0;
	final static int SONIC = 340;
	
	public static int getInstanceCount() {
		return instanceCount;
	}


	public TestPlane(String productCom, String modelName) {
		this(productCom, modelName, 250);
		instanceCount++;
	}
	
	public TestPlane(String productCom, String modelName, int maxPassenger) {
		this.productCom = productCom;
		this.modelName = modelName;
		this.maxPassenger = maxPassenger;
		instanceCount++;
	}

	public void setproductCom(String productCom) {
		this.productCom = productCom;

	}

	public void setmodelName(String modelName) {
		this.modelName = modelName;

	}

	public void setmaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;

	}

	public String getproductCom() {
		return productCom;

	}

	public String getmodelName() {

		return modelName;

	}

	public int getmaxPassenger() {

		return maxPassenger;

	}

	public static void main(String[] args) {

		TestPlane p = new TestPlane("보잉", "a380", 280);
		
		p.getmodelName();
		p.getproductCom();
		p.getmaxPassenger();
		
		TestPlane p2 = new TestPlane("재욱날다", "c8");
		
		p2.getmodelName();
		p2.getproductCom();
		p2.getmaxPassenger();
		
		TestPlane p3 = new TestPlane("아 집으로보내줘", "8282");
		
		p3.getproductCom();
		p3.getmodelName();
		

		System.out.println("세번째비행기회사이름:" + p3.getproductCom());
		System.out.println("생성된 비행기수:" + instanceCount);
		

		System.out.println("음속: " + SONIC + "m/s");
	}
}
