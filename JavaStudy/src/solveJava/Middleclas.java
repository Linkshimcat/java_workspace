package solveJava;

class MathUtil {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static boolean isEven(int n) {
        return (n % 2) == 0; // 연산자 우선순위 신경써서
    }
}


public class Middleclas {
    public static void mian(String[] args) {
        System.out.println(MathUtil.abs(5));
    }

}
