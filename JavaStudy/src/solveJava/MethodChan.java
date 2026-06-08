package solveJava;

class CoffeeOrder {
    String menu;
    String size;
    boolean extraShot;
    String cup;

//    매게변수 생성자
//    CoffeeOrder(String menu, String size, boolean extraShot, String cup) {
//        this.menu = menu;
//        this.size = size;
//        this.extraShot = extraShot;
//        this.cup = cup;
//    }

//    세터 메서드
//    public void setMenu(String menu) {
//        this.menu = menu;
//    }

    CoffeeOrder setMenu(String menu) {
        this.menu = menu;
        return this;
    }

    CoffeeOrder setSize(String size) {
        this.size = size;
        return this;
    }

    CoffeeOrder setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
        return this;
    }

    CoffeeOrder setCup(String cup) {
        this.cup = cup;
        return this;
    }

    String getOrder() {
        String shot = extraShot ? "샷 추가" : "샷 추가 없음";
        return "[ 주문 내역 ] " + menu + " / " + size + " / " + shot + " / " + cup;
    }
}

//    public void setSize(String size) {
//        this.size = size;
//    }

//    public void setExtraShot(boolean extraShot) {
//        this.extraShot = extraShot;
//    }

//    public void setCup(String cup) {
//        this.cup = cup;
//    }



public class MethodChan {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder()
                .setMenu("아메리카노")
                .setSize("Large")
                .setExtraShot(true)
                .setCup("텀블러");
        System.out.println(order.getOrder());

    }
}
