package Gammer;

import java.util.Scanner;
public class ControlStudy {
    public static void main(String[] args) {
        /*
        //조건문
        int score = 85;
        if(score >= 60) {
            System.out.println("합격 ㅊㅋ");
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("성인입니다."); //True 명령어 출력
        } else {
            System.out.println("미성년자입니다."); // False 명령어 출력
        }

        // =========================================================
        // 3. 다중 if문 (else if)
        // =========================================================
        int point = 72;

        if (point >= 90) {
            System.out.println("A");
        } else if (point >= 80) {
            System.out.println("B");
        } else if (point >= 70) {
            System.out.println("C"); // point가 72에 조건에 해당하면 "C"에 해당함.
        } else {
            System.out.println("F");
        }

         */

        /*
        // Switch문
        int day = 3;
        switch (day) {
            case 1: // (1 = 3은 같지 않음) 동등 비교
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break; // 멈춤
            default: // else if랑 비슷함. (어짜피 default는 마지막에
                System.out.println("기타");
          */


        /*
        int day = 3;
        if (day == 1) {
            System.out.println("월요일");
        } else if (day == 2) {
            System.out.println("화요일");
        } else  {
            System.out.println("기타");
        }
         */


//        for(int row = 1; row <=5; row++) {
//            for (int col = 5; col>= row; col--) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//
//        //반대
//        for(int row = 1; row <=5; row++) {
//            for (int col = 1; col<= row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            //출력 결과
//            //1
//            //1 2
//            //1 2 3
//            //1 2 3 4
//            //1 2 3 4 5



        // 월의 마지막 일 구하는 문제
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요:");
        int Month = sc.nextInt();

        switch (Month) {
            case 1, 3, 5, 7, 8, 10, 12 :  System.out.print(Month + "월의 마지막은 31일 입니다.");
                break;
            case 4, 6, 9, 11 :  System.out.print(Month + "월의 마지막은 30일 입니다.");
                break;

            default :  System.out.print(Month + "월의 마지막은 28일 입니다."); // else와 같은 역할을 함
                break;

        }
        sc.close();

        }

    }
