package solveJava;

import java.util.Scanner; //Scanner 모듈 불러오기

public class Constant_1211 {
    public static void main(String[] args) {

        /*
        -- 시험 점수 문제
        final int STANDARD_SCORE = 85;
        Scanner sc = new Scanner(System.in);

        System.out.print("시험 점수: ");
        int score = Integer.parseInt(sc.nextLine());
        System.out.println(score + "-" + STANDARD_SCORE + "=" + (score - STANDARD_SCORE));

         */

        /*

        -- PI 문제
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in); // 입력창

        System.out.print("반지름: ");
        double r = sc.nextDouble();
        System.out.println("반지름 " + r + "인 원의 둘레: " + (2 * PI * r));
        System.out.println("반지름 " + r + "인 원의 둘레: " + (PI * (r * r)));
         */

      
        // -- 국,영,수,자바 합과 평균 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요: ");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요: ");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int math = sc.nextInt();

        System.out.print("JAVA 점수를 입력하세요: ");
        int java = sc.nextInt();

        System.out.println("합계: " + (kor + eng + math + java));
        System.out.println("평균: " + (kor + eng + math + java)/4);

       
    }
}


