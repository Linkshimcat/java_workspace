package solveJava;

import java.util.Arrays;

public class ArrayPDF {
    public static void main(String[] args) {

        // 배열에 A-Z까지 저장하기
        /*char[] uppers = new char[26];
        int idx = 0;

        for (char c = 'A'; c<='Z'; c++) {
            uppers[idx] = c;
            idx++;
        }
        System.out.println(Arrays.toString(uppers));*/

        // 2차원 배열 이용해서 for문 2개 쓰기
        int[][] arry = new int[4][];
        int num = 1;
        for (int i = 0; i < arry.length; i++) {
            arry[i] = new int [i + 1];
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j] = num;
                num++;
            }
        }

        System.out.println("----자바실행----");
        System.out.println((Arrays.deepToString(arry)));


    }
}
