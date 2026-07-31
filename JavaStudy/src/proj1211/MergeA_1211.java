package proj1211;

import java.util.Scanner;
public class MergeA_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("배열 1의 " + i + "번방 입력: ");
            array1[i] = sc.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("배열 2의 " + j + "번방 입력: ");
            array2[j] = sc.nextInt();
        }
        System.out.println();

        System.out.print("배열1 데이터: ");
        for (int a : array1) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.print("배열2 데이터: ");
        for (int b : array2) {
            System.out.print(b + " ");
        }
        System.out.println();

        int[] merged = new int[10];
        for (int i = 0; i < 5; i++) {
            merged[i] = array1[i];
            merged[i + 5] = array2[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        System.out.print("전체 데이터(오름차순) : ");
        for (int nums : merged) {
            System.out.print(nums + " ");
        }
        System.out.println();

        System.out.print("중복 제거된 데이터 : ");
        System.out.print(merged[0] + " ");
        for (int i = 1; i < 10; i++) {
            if (merged[i] != merged[i - 1]) {
                System.out.print(merged[i] + " ");
            }
        }

    }
}
