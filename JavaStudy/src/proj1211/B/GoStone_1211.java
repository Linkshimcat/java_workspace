//1211 이윤재
package proj1211.B;

import java.util.Scanner;
public class GoStone_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("바둑판 크기: ");
        int N = sc.nextInt();
        String[][] box = new String[N][N];
        for (int i = 0; i < box.length; i++) {
            System.out.println();
            for (int j = 0; j < box.length; j++) {
                box[i][j] = ".";
                System.out.print(box[i][j] + " ");
            }
        }
        System.out.println();

        int W_count = 0;
        int B_count = 0;
        while(true) {
            System.out.print("1.백돌   2.흑돌   3.현황   4.종료 :");
            int choose = sc.nextInt();

            if (choose == 1) {
                System.out.print("백돌 놓을 행 번호:");
                int W_row = sc.nextInt() - 1;
                System.out.print("백돌 놓을 열 번호:");
                int W_col = sc.nextInt() - 1;
                if (box[W_row][W_col].equals("W") || box[W_row][W_col].equals("B")) {
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                }else {
                    box[W_row][W_col] = "W";
                    System.out.println((W_row + 1) + "행 " + (W_col + 1) + "열에 백돌(W) 배치 완료!");
                    W_count++;
                }
            }
            else if (choose == 2) {
                System.out.print("흑돌 놓을 행 번호:");
                int B_row = sc.nextInt() - 1;
                System.out.print("흑돌 놓을 열 번호:");
                int B_col = sc.nextInt() - 1;
                if (box[B_row][B_col].equals("B") || box[B_row][B_col].equals("W")) {
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                } else {
                    box[B_row][B_col] = "B";
                    System.out.println((B_row + 1) + "행 " + (B_col + 1) + "열에 흑돌(B) 배치 완료!");
                    B_count++;
                }
            }
            else if (choose == 3) {
                for (int i = 0; i < box.length; i++) {
                    System.out.println();
                    for (int j = 0; j < box.length; j++) {
                        System.out.print(box[i][j] + " ");
                    }
                }
                System.out.println();
                System.out.println("백돌: " + W_count + "개  " + "흑돌" + B_count + "개");
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
