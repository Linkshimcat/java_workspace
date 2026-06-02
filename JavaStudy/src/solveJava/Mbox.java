package solveJava;

class Product {
    String name;
    int price;

    Product() {
        this.name = "미정";
        this.price = 0;
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


//    String name;
//    int score;

//    MyStudent2(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
}

public class Mbox {
    public static void main(String[] args) {

        Product info = new Product();
        System.out.println(info.name + " / " + info.price);
        Product info2 = new Product("노트북", 120000);
        System.out.println(info2.name + " / " + info2.price);


//        MyStudent2 b = new MyStudent2("홍길동", 95);
//        System.out.println(b.name + " : " + b.score + "점");

    }
}
