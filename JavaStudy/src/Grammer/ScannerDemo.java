package Grammer;

import java.util.Scanner; //자바 Scanner 모듈 불러오기

public class ScannerDemo {
    public static void main(String[] args) {

        //정수 int
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int a = sc.nextInt(); //
        System.out.println(a);
        System.out.println("입력한 정수: " + a);

        //실수 double
        System.out.print("실수를 입력하세요:");
        double b = sc.nextDouble();
        System.out.println(b);
        System.out.println("입력한 실수: " + b);

        //문자열 String
        sc.nextLine(); //문자열을 한번더 입력시킬 수 있게 만든다.
        System.out.print("문자를 입력하세요:");
        String c = sc.nextLine();
        System.out.println(c);
        System.out.println("입력한 문자: " + c);

        //정수 int
        System.out.print("정수를 입력하세요");
        String ax = sc.nextLine();
        int aa = Integer.parseInt(ax); // 문자열을 숫자 int로 바꿈
        System.out.println("당신이 입력한 정수: " + aa);

    }
}
