public class PaddingGo {
    public static void main(String[] args) {
        Padding go = new Padding();
        Padding go2 = new Padding();

        go.paddingName = "나이키";
        go.yes = true;
        go.discount = 20;
        go.realwon = 100000;

        go2.paddingName = "아디다스";
        go2.yes = false;
        go2.discount = 0;
        go2.realwon = 80000;

        go.printAll();
        go.disornot();
        System.out.println("할인가격: " + go.realprice() +"\n");

        go2.printAll();
        go2.disornot();
        System.out.println("할인가격: " + go2.realprice());
    }
}