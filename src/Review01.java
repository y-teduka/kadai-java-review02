
public class Review01 {

    public static void main(String[] args) {
        int zei=11;
        int price=1500;
        int result=tax(zei,price);
        System.out.println(price+"円の商品の税込価格は"+(price+result)+"円（消費税は"+result+"円）です。");
    }

    public static int tax(int zei,int price) {
    int result=(int)(price*(zei*0.01));
    return result;
    }
}