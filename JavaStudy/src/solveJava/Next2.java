package solveJava;

import java.util.Scanner;

public class Next2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수학 점수를 입력하세요: ");
        int math = sc.nextInt();

        System.out.print("당신의 국어 점수를 입력하세요: ");
        int kor = sc.nextInt();

        System.out.print("당신의 영어 점수를 입력하세요: ");
        int eng = sc.nextInt();

        System.out.print("당신의 JAVA 점수를 입력하세요: ");
        int java = sc.nextInt();

        int total = (java + eng + kor + math);

        System.out.println("총합 과목 점수: " + total + "점 입니다.");
        System.out.println("총합 평균과목 점수: " + (total)/4 + "점 입니다.");

    }
}