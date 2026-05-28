class MyCircle {
    double radius; //필드 radius

     double getArea() {
         double pi = 3.14;
         return radius*radius*pi; //void없을땐 return안씀, 선언전 return은 쓸 수 없다.
     }
}

public class CircleSolve {
    public static void main(String[] args) {
        MyCircle result = new MyCircle();
        result.radius = 5;

        double area = result.getArea();
        System.out.println("넓이: " + area);
    }
}
