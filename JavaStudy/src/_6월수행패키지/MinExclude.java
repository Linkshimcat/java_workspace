package _6월수행패키지;
import java.util.Scanner;

public class MinExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        #2번 문제
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("배열 1의" + i + "번방 입력: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("배열 2의" + i + "번방 입력: ");
            arr2[i] = sc.nextInt();
        }

//        배열 결과
        System.out.println("배열 1의 데이터: ");
        for (int i = 0; i <5; i++) {
            System.out.println(" " + arr1[i] + " ");
        }
        System.out.println("배열 2의 데이터: ");
        for (int i = 0; i <5; i++) {
            System.out.println(arr2[i] + " ");
        }

        int[] merge = new int[10];
        for (int i = 0; i < 5; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < 5; i++) {
            merge[i + 5] = arr2[i];
        }



//        # 1번 문제
        /*System.out.print("정수 개수: ");
        int N = sc.nextInt();
        double[] arry = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번 째 정수: ");
            double d = sc.nextDouble();
            arry[i] = d;
        }

        System.out.print("입력 점수: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arry[i] + "\t");
        }
        System.out.println(); // 줄바꿈 추가

        // 1. 최솟값과 그 인덱스 찾기 (0번 인덱스로 초기화)
        int index = 0;
        double min = arry[0];
        for (int i = 1; i < N; i++) { // 0번은 이미 기준이므로 1부터 검사해도 됨
            if (arry[i] < min) {
                min = arry[i];
                index = i;
            }
        }

        // 2. 최솟값을 제외한 합계 구하기 (0부터 시작)
        double sum = 0;
        for (int i = 0; i < N; i++) {
            if (index != i) {
                sum += arry[i];
            }
        }

        // 3. printf와 %.2f 포맷팅을 사용해 올바르게 출력
        System.out.printf("최솟값 제외 합계: %.2f\n", sum);
        System.out.printf("최솟값 제외 평균: %.2f\n", (sum / (N - 1)));*/

    }
}