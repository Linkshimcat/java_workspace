package proj1211.A;

import java.util.Scanner;

public class MinExclude_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 개수: ");
        int N = sc.nextInt();

        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 점수: ");
            array[i] = sc.nextDouble();
        }

        System.out.print("입력 점수: ");
        for (double s : array) {
            System.out.print(s + "  ");
        }
        System.out.println();

        double min = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("제거된 최솟값: " + min);

        double sum = 0;
        for (double ab : array) {
            sum += ab;
        }
        System.out.println("최솟값 제외 합계: " + (sum - min));
        System.out.print("최솟값 제외 평균: ");
        System.out.printf("%.2f%n", ((sum - min) / (N - 1)));

    }
}