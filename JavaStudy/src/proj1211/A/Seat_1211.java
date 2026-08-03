package proj1211.A;

import java.util.Scanner;
public class Seat_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 크기: ");
        int N = sc.nextInt();

        String[][] seat = new String[N][N];

        System.out.println("=== 극장 좌석 예약 시스템 ===");

        // Default 좌석
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (i == 0) {
                    seat[i][j] = "R";
                } else {
                    seat[i][j] = "O";
                }
            }
        }

        int emptySum = 0;
        int bookSum = 0;

        // 죄석 크기 입력하면 뜨는 현황
        for (int i = 0; i < seat.length; i++) {
            System.out.println();
            for (int j = 0; j < seat[i].length; j++) {
                System.out.print("[ " + seat[i][j] + " ]");
                if (seat[i][j].equals("X")) {
                    bookSum++;
                } else {
                    emptySum++;
                }
            }
        }
        System.out.println();
        System.out.println("빈 자리 : " +  emptySum + "개" +  " | 예약된 자리 : " + bookSum + "개");
        System.out.println();


        // 사용자 메뉴
        while(true) {
            //      메뉴 선택 카운트
            int emptySum2 = 0;
            int bookSum2 = 0;

            System.out.print("1. 예약   2.취소    3.현환    4.종료 :");
            int choose = sc.nextInt();

            if (choose == 1) {
                System.out.print("예약할 행 번호: ");
                int row_num = sc.nextInt() - 1;
                System.out.print("예약할 열 번호: ");
                int col_num = sc.nextInt() - 1;
//                ----
                String checkup =  seat[row_num][col_num];
                if (checkup.equals("O") || checkup.equals("R")) {
                    seat[row_num][col_num] = "X";
                    System.out.println((row_num + 1) + "행 " + (col_num + 1) + "열 좌석 예약 완료!");
                } else {
                    System.out.println("[오류] 이미 예약된 좌석입니다.");
                }
            }

            else if (choose == 2) {
                System.out.print("취소할 행 번호: ");
                int row_cancel = sc.nextInt() - 1;
                System.out.print("취소할 열 번호: ");
                int col_cancel = sc.nextInt() - 1;
//                ---
                seat[row_cancel][col_cancel] = "O";
                System.out.println((row_cancel + 1) + "행 " + (col_cancel + 1) + "열 좌석 취소 완료!");
            }


            else if (choose == 3) {
                for (int i = 0; i < seat.length; i++) {
                    System.out.println();
                    for (int j = 0; j < seat[i].length; j++) {
                        System.out.print("[ " + seat[i][j] + " ]");
                        if (seat[i][j].equals("X")) {
                            bookSum2++;
                        } else {
                            emptySum2++;
                        }
                    }
                }
                System.out.println();
                System.out.println("빈 자리 : " +  emptySum2 + "개" +  " | 예약된 자리 : " + bookSum2 + "개");
            }

            else if (choose == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}
