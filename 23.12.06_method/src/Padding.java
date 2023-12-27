// 입는 패딩 모델명: String
// 실제 가격: int
// 할인중 : boolean
// 할인율 : int

// 구입시 가격을 반환 하는 메소드 : int// 소수점 버림
//출력예) 모델명
//실가격
//false
//0
// 가격
public class Padding {
    String paddingName;
    int realwon;
    boolean yes;
    double discount;
    
    public void printAll() {
    	System.out.println(paddingName);
        System.out.println("실가격: " + realwon);
        System.out.println("할인율: " + discount + "%");
    }
    
    public void toggleDiscount() {
        yes = !yes;
    }

    public void disornot() {
        if (yes) {
            System.out.println("할인 중");
        } else {
            System.out.println("할인 없음");
        }
    }

    public double realprice() {
        if (yes) {
            double discountedPrice = realwon * (1 - discount / 100.0);
            return discountedPrice;
        } else {
            return realwon;
        }
    }
}