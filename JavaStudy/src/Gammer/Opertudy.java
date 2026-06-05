package Gammer;

public class Opertudy {
    public static void main(String[] args) {
        int a = 10;
        a++;
        ++a;
        System.out.println(a);

        // 1. 기본 증감 연산자
        int as = 5;
        System.out.println("as   : " + as);    // 5
        System.out.println("as++ : " + as++);  // 5 ← 출력 후 증가
        System.out.println("as   : " + as);    // 6
        System.out.println("++as : " + ++as);  // 7 ← 증가 후 출력
        System.out.println("as   : " + as);    // 7
        System.out.println();

        String s = "반갑다.";
        System.out.println(s instanceof String); // instanceof가 (String 입니까?) 맞으면 True / 틀리면 False



    }
}
