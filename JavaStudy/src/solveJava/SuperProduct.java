package solveJava;

class MyProduct {
    String name;
    int price;
    int stock;

     MyProduct(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
     }

    void sell(int qty) {
        if((stock - qty) < 0) {
            System.out.println("재고가 부족합니다.");
        }
        else {
            stock -= qty;
        }
    }

    void restock(int qty) {
        if (qty <= 0) {
            System.out.println("유효하지 않는 수량입니다.");
        }
        else {
            stock += qty;
        }
    }

    String getInfo() {
    return  name + " | " + price + "원 | " + "재고: " + stock + "개";
    }


}

public class SuperProduct {
    public static void main(String[] args) {
        MyProduct b = new MyProduct("노트북", 1200000, 10);
        System.out.println(b.getInfo());
        b.sell(3);
        System.out.println(b.getInfo());
        b.sell(999);
        b.restock(-5);
        b.restock(5);
        System.out.println(b.getInfo());


    }
}
