class MyCar {
    String color;
    String speed;
}

public class CarDemo {
    public static void main(String[] args) {
        MyCar info = new MyCar();
        info.color = "빨간색 자동차";
        info.speed = "100";

        MyCar info2 = new MyCar();
        info2.color = "파란색 자동차";
        info2.speed = "150";

        System.out.println(info.color + ", " + info.speed);
        System.out.println(info2.color + ", " + info2.speed);
    }
}
