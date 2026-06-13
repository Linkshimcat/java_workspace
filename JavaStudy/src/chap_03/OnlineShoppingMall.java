package chap_03;

public class OnlineShoppingMall {
    public static void main(String[] args) {
        int price = 30000;
        int coupon = 5000;

        int totalPrice = price - coupon;

        boolean applyFreeShopping = (totalPrice > 20000);

        System.out.println("최종 결제 금액: " + totalPrice + "원");
        System.out.println("무료 배송 적용 여부: " + applyFreeShopping);

    }
}
