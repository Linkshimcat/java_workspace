//1211 이윤재
package proj1211.B;

import Grammer.PrivatePerson;

import java.util.Scanner;
public class MaxExclude_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 개수: ");
        int N = sc.nextInt();
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 점수: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.print("입력 점수: ");
        for (double a : array) {
            sum += a;
            System.out.print(a + "\t");
        }
        System.out.println();

        double maxArray = array[0];
        for (int i = 0; i < N; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        System.out.println("제거된 최고점: " + maxArray);
        System.out.println("최고점 제외 합계:" + (sum - maxArray));
        System.out.printf("최고점 제외 평균: %.2f%n", ((sum - maxArray) / (N - 1)));
    }
}
