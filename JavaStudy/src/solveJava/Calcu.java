package solveJava;

class MyCalculator { //메서드 오버로딩
    int add(int a, int b) {
        return a+b;
    }
    int add(int a, int b, int c) { //매게변수의 개수가 다름
        return a + b + c;
    }
    double add(double a , double b) {
        return a + b;
    }

}

public class Calcu {
    public static void main(String[] args) {
        MyCalculator result = new MyCalculator();
        System.out.println(result.add(1, 2));
        MyCalculator result2 = new MyCalculator();
        System.out.println(result.add(3, 3));
        MyCalculator result3 = new MyCalculator();
        System.out.println(result.add(5.0, 0.5));


    }
}
