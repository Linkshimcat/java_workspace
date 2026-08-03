//1211 이윤재
package proj1211.B;

import java.util.Scanner;
public class MergeD_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("배열1의 " + (i) + "번방 입력: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("배열2의 " + (i) + "번방 입력: ");
            array2[i] = sc.nextInt();
        }

        System.out.print("배열1의 데이터: ");
        for (int a : array) {
            System.out.print(a + "\t");
        }
        System.out.println();
        System.out.print("배열2의 데이터: ");
        for (int b : array2) {
            System.out.print(b + "\t");
        }
        System.out.println();

        int[] merge = new int[10];
        for (int i = 0; i < 5; i++) {
            merge[i] = array[i];
            merge[i + 5] = array2[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (merge[i] < merge[j]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        System.out.print("전체 데이터 (내림차순): ");
        for (int num : merge) {
            System.out.print(num + "\t");
        }
        System.out.println();

        System.out.print("중복 제거된 데이터 : ");
        System.out.print(merge[0] + " ");
        for (int i = 1; i < 10; i++) {
            if (merge[i] != merge[i - 1]) {
                System.out.print(merge[i] + " ");
            }
        }

    }
}
