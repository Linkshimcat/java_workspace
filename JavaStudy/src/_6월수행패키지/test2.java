package _6월수행패키지;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[] arry = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) +  "번째 정수 : ");
            arry[i] = sc.nextInt();
        }

        boolean check = false;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 == 0) {
                System.out.print(arry[i] + " ");
                check = true;
            }
            if (!check) {
                System.out.println("짝수 없음!");
            }
        }
*/

/*
        System.out.print("학생 수: ");
        int Student = sc.nextInt();
        int[] arrys = new int[Student];

        for (int i = 0; i < Student; i++) {
            System.out.print((i + 1) + "번 학생 점수 : ");
            arrys[i] = sc.nextInt();
        }

        for (int i = 0; i < arrys.length; i++) {
            String grade;
            if (arrys[i] >= 90) {
                grade = "A";
            }
            else if (arrys[i] >= 80) {
                grade = "B";
            }
            else if (arrys[i] >= 70) {
                grade = "C";
            }
            else if (arrys[i] >= 60) {
                grade = "D";
            }
            else {
                grade = "F";
            }
            System.out.println((i + 1) + "번 학생 : " + arrys[i] + "점 -> " + grade);
        }
*/

/*        int[] arry = {1, 2, 3, 4, 5};

        for (int i = arry.length - 1; i >= 0; i--) {
            System.out.println(arry[i]);
        }*/



//        배열 꺼구로 뒤집기
        System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[] arry = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 값: ");
            arry[i] =  sc.nextInt();
        }

        for (int i = arry.length - 1; i >= 0; i--) {
            System.out.println(arry[i]);
        }


    }
}
