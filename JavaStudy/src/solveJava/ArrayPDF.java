package solveJava;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Arrays;

public class ArrayPDF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열에 A-Z까지 저장하기
        /*char[] uppers = new char[26];
        int idx = 0;

        for (char c = 'A'; c<='Z'; c++) {
            uppers[idx] = c;
            idx++;
        }
        System.out.println(Arrays.toString(uppers));*/

        // 2차원 배열 이용해서 for문 2개 쓰기
/*        int[][] arry = new int[4][];
        int num = 1;
        for (int i = 0; i < arry.length; i++) {
            arry[i] = new int [i + 1];
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j] = num;
                num++;
            }
        }

        System.out.println("----자바실행----");
        System.out.println((Arrays.deepToString(arry)));*/

//        # 점수대별로 학생수 만큼 '*'가 표시되는 프로그램
/*        System.out.print("점수 입력: ");

        int[] arry = new int[5];
        while (true) {
            int Score = sc.nextInt();
//            0 미만, 100 초과인 경우 끝내기
            if (Score < 0 || Score > 100) {
                break;
            }

//            각 점수대 별로 카운드 증가
            if (Score >= 90) {
                arry[0]++;
            }
            else if (Score >= 80) {
                arry[1]++;
            }
            else if (Score >= 70) {
                arry[2]++;
            }
            else if (Score >= 60) {
                arry[3]++;
            }
            else {
                arry[4]++;
            }
        }

        for (int i = 0; i < arry.length; i++) {
            switch (i) {
                case 0 :
                    System.out.println("90점 이상: ");
                    for (int j = 0; j < arry[i]; j++) System.out.print("* ");
                    System.out.println();
                    break;
                case 1 :
                    System.out.println("80점 대 : ");
                    for (int j = 0; j < arry[i]; j++) System.out.print("* ");
                    System.out.println();
                    break;
                case 2 :
                    System.out.println("70점 대: ");
                    for (int j = 0; j < arry[i]; j++) System.out.print("* ");
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("60점 대: ");
                    for (int j = 0; j < arry[i]; j++) System.out.print("* ");
                    System.out.println();
                    break;
                default :
                    System.out.println("60점 대: ");
                    for (int j = 0; j < arry[i]; j++) System.out.print("* ");
                    System.out.println();*/


//      # 1~30까지 임의 수 50개 생성후 (최대값, 최소값)
        // 1. 1~30까지 임의 수 50개 생성
        int[] randomNums = new int[50];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = ThreadLocalRandom.current().nextInt(1, 31);
        }

        // 2. 각 숫자의 빈도수 계산
        int[] counts = new int[30];
        for (int i = 0; i < randomNums.length; i++) {
            counts[randomNums[i] - 1]++; // 숫자가 1이면 counts[0]에 저장되므로 -1 필요
        }

        // 3. 가장 높은 빈도수(최대값) 찾기
        int maxFrequency = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > maxFrequency) {
                maxFrequency = counts[i];
            }
        }

        // 4. 가장 빈도수가 높은 수들을 찾아 출력 (공동 1위가 있을 수 있으므로)
        System.out.print("가장 빈도수가 높은 수는: ");
        boolean isFirst = true;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxFrequency) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print((i + 1)); // 인덱스는 0부터 시작하므로 실제 숫자는 +1
                isFirst = false;
            }
        }
        System.out.println(" (빈도수: " + maxFrequency + "회)");

        // 데이터 확인용 출력
        System.out.println("생성된 난수들: " + Arrays.toString(randomNums));
        System.out.println("1~30 빈도수: " + Arrays.toString(counts));
    }

}
