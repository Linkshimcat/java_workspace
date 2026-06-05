package Gammer;

public class Whil2 {
    public static void main(String[] args) {
        int a = 10;
        while (a<=12) {
            System.out.println(a);
            a++; //증감 연산자
        }
    }
}

class dodo2{
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
            if (i==8) {
                continue;
            }
        }
    }
}
