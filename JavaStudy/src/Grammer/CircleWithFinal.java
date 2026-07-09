package Grammer;

public class CircleWithFinal {
    public  final  double radius;
    public final  double HELLO_WORLD = 3.145; // final은 값이 불변(변하지 않는)하는 특징을 갖고 있음.

    // *final은 상수 필드를 만들때 쓸 수 있음, 그리고 바로 초기화 하던지 아니면, 모든 생성자에서 초기화를 해줘야 함.

    public CircleWithFinal() {
        radius = 22;
    }

    public CircleWithFinal(double A) {
        radius = 2;
    }

}
