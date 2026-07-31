package proj1211;// 1211 이윤재

import java.util.Random;
import java.util.Scanner;
public class MaxNum_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기: ");
        int N = sc.nextInt();

        int[][] array = new int[N][N];

        Random randInRange = new Random();

        System.out.println(N + " X " + N + " 배열의 데이터:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = randInRange.nextInt(100) + 1;
                System.out.print("\t" + array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("최댓값: " + max);
        System.out.println("최댓값의 위치: " + "(" + maxRow + ", " + maxCol + ")");
    }
}
