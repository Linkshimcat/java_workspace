package solveJava;
import java.util.Arrays;
import java.util.Scanner;


public class ArraySolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        # 배열 역순 출력
//        System.out.print("N 입력 : ");
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "번째 정수 : ");
//            nums[i] = sc.nextInt();
//        }
//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//        sc.close();


//        #배열에서 특정 값 탐색
//        System.out.print("N 입력:");
//        int iput = sc.nextInt();
//        int[] arry = new int[iput];
//
//        for(int i = 0; i < iput; i++) {
//            System.out.print((i + 1) + "번째 정수: ");
//            int num = sc.nextInt();
//            arry[i] = num;
//        }
//
//        찾을 값 입력
//        System.out.println("찾을 값: ");
//        int target = sc.nextInt();
//        int count = 0;
//        boolean found = false;
//        for(int i = 0; i<target; i++) {
//            if(arry[i] == target) {
//                System.out.println("인덱스: " + i);
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("찾을 수 없습니다.");
//        }
//        sc.close();

/*//        #배열 복사
        System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[] arry = new int[N];

        for(int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            arry[i] = sc.nextInt();
        }



//        똑같은 크기의 새 배열 만들기
        int[] copy = new int[N];
        for(int i = 0; i < N; i++) {
            copy[i] = arry[i];
        }
        arry[0] = 999;
        System.out.print("원본  : ");
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i] + " ");
        }
        System.out.println();
        System.out.print("복사본 : ");
        for(int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");
        }
        System.out.println();
        sc.close();*/

//      # 4번 문제: 두 배열 통합하기
//        첫번째 배열
//        System.out.print("첫번째 배열 N 입력: ");
//        int N = sc.nextInt();
//        int[] arr1 = new int[N];
//        for (int i = 0; i < N; i++) {
//            System.out.print((i + 1)  + "번째 정수: ");
//            arr1[i] = sc.nextInt();
//        }
////        두번째 배열
//        System.out.print("두번째 배열 M: ");
//        int M = sc.nextInt();
//        int[] arr2 = new int[M];
//        for(int i = 0; i < M; i++) {
//            System.out.print((i + 1) + "번째 정수: ");
//            arr2[i] = sc.nextInt();
//        }
////      N + M의 최종 배열
//        int[] merged = new int[N + M];
//        for (int i = 0; i < N; i++) {
//            merged[i] = arr1[i];
//        }
//        for (int i = 0; i < M; i++) {
//            merged[N + i] = arr2[i];
//        }
//        System.out.print("병합된 배열 : ");
//        for (int i = 0; i < merged.length; i++) {
//            System.out.print(merged[i] + " ");
//        }
//        System.out.println();
//        sc.close();


//        #5번 문제

//        #6번 문제
//        System.out.print("N 입력: ");
//        int N = sc.nextInt();
//        int[] arry = new int[N];
//        int P_count = 0;
//        int M_count = 0;
//        int Zero = 0;
//
//        for(int i = 0; i < N; i++) {
//            System.out.print((i + 1) + "번째 정수: ");
//            arry[i] = sc.nextInt();
//            if(arry[i] > 0) {
//                P_count ++;
//            }
//            else if (arry[i] < 0) {
//                M_count++;
//            }
//            else {
//                Zero++;
//            }
//        }
//        System.out.println("양수: " + P_count);
//        System.out.println("음수: " + M_count);
//        System.out.println("0 : " + Zero);


//        #7번 - 배열 성적 처리
/*        System.out.print("학생 수: ");
        int Student = sc.nextInt();
        int[] arry = new int[Student];

        for (int i = 0; i < Student; i++) {
            System.out.print((i + 1) + "번 학생 점수 : ");
            arry[i] = sc.nextInt();
        }

        int score = 0;
        int Min = arry[0];
        int Max = arry[0];

        for (int i = 0; i < arry.length; i++) {
            score += arry[i];
            if (arry[i] > Max) {
                Max = arry[i];
            }
            if (arry[i] < Min) {
                Min = arry[i];
            }
        }
        System.out.println("합계   : " + score);
        System.out.println("평균   : " + (double) score / Student);
        System.out.println("최고점 : " + Max);
        System.out.println("최저점 : " + Min);*/


//        #배열 11번 문제
/*        System.out.print("상품 수: ");
        int product = sc.nextInt();
        int[] arry = new int[product];


        for(int i = 0; i < product; i++) {
            System.out.print((i + 1) + "번 상품 재고 : ");
            arry[i] = sc.nextInt();
        }

        int goods = 0;
        for(int i = 0; i < arry.length; i++) {
            System.out.print((i + 1) + "번 상품 : ");
            goods += arry[i];
            if (arry[i] >= 6) {
                System.out.print(arry[i] + "개");
            }
            else if (arry[i] <= 5 || arry[i] >= 1) {
                System.out.print("재고 부족 (" + arry[i] + "개)");
            }
            else if (arry[i] <= 0){
                System.out.print("품절");
            }
            else {
                System.out.print("품절");
            }
            System.out.println();
        }
        System.out.println("전체 재고 : " + goods);*/


//        #12번 문제
/*        System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[] arry = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 정수 : ");
            arry[i] = sc.nextInt();
        }

        int[] result = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean founDuplication = false;
            for (int j = 0; j < count; j++) {
                if (arry[i] == result[j]) {
                    founDuplication = true;
                    break;
                }
            }
            if (!founDuplication) {
                result[count++] = arry[i];
            }
        }
        System.out.println("결과 : ");
        for (int i = 0; i < count; i++) {
            System.out.println(result[i] + " ");
        }
        System.out.println();
        sc.close();*/

//        #13번 문제
 /*       System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[] arry = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 정수 : ");
            arry[i] = sc.nextInt();
        }

        int i = 0;
        int j = N - 1;
        boolean isSymmetric = true;
        for ( ; j > i ; i++, j--) {
            if(arry[i] != arry[j]) {
                isSymmetric = false;
                break;
            }
        }

        System.out.println((isSymmetric) ? "대칭 배열입니다" : "대칭 배열이 아닙니다.");
*/


//        #14번 문제 -  학생 성적 합격 여부
  /*      System.out.print("학생 수 : ");
        int Stoal = sc.nextInt();
        int[][] arry = new int[Stoal][]; // 2차원 배열

        for (int i = 0; i < Stoal; i++) {
            System.out.print((i + 1) + "번 학생 (국어 영어 수학) : ");
            arry[i] = new int[3];
//            반복문 돌면서 0, 1, 2번에 (국,영,수) 점수 넣기
            String[] subject = new String[]{"국어", "수학", "영어"};
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + "과목 점수 입력:");
                int score = sc.nextInt();
                arry[i][j] = score;
            }
        }
//        System.out.println(Arrays.deepToString(arry)); // 배열 데이터 확인하기
        for (int i = 0; i < Stoal; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arry[i][j];
            }
            double avg = (double) sum / 3;
            System.out.println((i + 1) + "번 학생: 평균 " + avg + " 점 -> "
            + ((avg > 60) ? "합격" : "불합격"));
        }*/


//        #15번 문제 - 2차원 배열 합계
/*        int[][] arry = new int[3][3];
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                System.out.print((i + 1) + "행 " + (j + 1) + "열 : ");
                arry[i][j] = sc.nextInt();
            }
        }

        int sum = 0; // 배열 합계 변수
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                sum += arry[i][j];
            }
        }
        System.out.println("전체 합계: " + sum);*/


//        #16번 2차원 배열 행별 합계

        /*       System.out.print("행(N) : ");
        int N = sc.nextInt();
        System.out.print("행(M) : ");
        int M = sc.nextInt();

        int[][] arry = new int[N][M];

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                System.out.print((i + 1) + "행 " + (j + 1) + "열 :");
                arry[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arry.length; i++) {
            int sum = 0;
            for (int j = 0; j < arry.length; j++) {
                sum += arry[i][j];
            }
            System.out.println((i + 1) + "행 합계: " + sum);
        }*/


//        #17번 문제 - 2차원 배열 열별 합계
        System.out.print("행 (N) : ");
        int N = sc.nextInt();
        System.out.print("열 (M) : ");
        int M = sc.nextInt();

        int[][] arry = new int[N][M];

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                System.out.print((i + 1) + "행" + (j + 1) + "열: ");
                arry[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < arry.length; j++) {
            int sum = 0;
            for (int i = 0; i < arry.length; i++) {
                sum += arry[i][j];
            }
            System.out.println((j + 1) + "열 합계: " + sum);
        }

    }
}
