//1211 이윤재
package proj1211.B;

import Grammer.PrivatePerson;

import java.util.Scanner;
import java.util.Random;
public class MinNum_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("배열의 크기: ");
        int N = sc.nextInt();

        int[][] arrayN = new int[N][N];
        System.out.println(N + " X " + N + "배열의 데이터: ");
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayN.length; j++) {
                arrayN[i][j] = random.nextInt(1, 101);
                System.out.print("\t" + arrayN[i][j] + "\t");
            }
        }
        System.out.println();

        int minValue = arrayN[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN.length; j++) {
                if (minValue > arrayN[i][j]) {
                    minValue = arrayN[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("최솟값: " + minValue);
        System.out.println("최솟값의 위치: " + "(" + row + ", " + col + ")");
    }
}
