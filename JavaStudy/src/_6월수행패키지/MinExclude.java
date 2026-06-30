package _6월수행패키지;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//        -----------------------5번 문제
class Member {
    String name;
    int age;
    int point;

    void setAge(int age) {
        if (age < 0) {
            System.out.println("유효하지 않는 나이입니다.");
        }
        else { // 음수가 아니고 양수인 나이인 경우.
            this.age = age; // age 값 대입
        }
    }

     String getInfo() {
        return String.format("이름 %s | 나이: %d | 포인트: %d", name, age, point); //%s는 String, %d는 정수
    }

}

class Movie {
    String title;
    String director;
    int time;

    Movie(String title, String director, int time) {
        this.title = title;
        this.director = director;
        this.time = time;
    }

    void printInfo() {
        System.out.println(title + "\t" + director + "\t" + time);
    }


}

public class MinExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ------------------[마지막] 6번 문제
        Movie[] movies = new Movie[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("영화" + (i + 1) + "제목: ");
            String title = sc.nextLine();
            System.out.print("영화" + (i + 1) + "감독명: ");
            String director = sc.nextLine();
            System.out.print("영화" + (i + 1) + "상영시간(분): ");
            int totaltime = sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(title, director, totaltime);
            total += totaltime;
        }

        System.out.println("영화제목\t영화감독\t상영시간(분)");
        for (int i = 0; i < 5; i++) {
            movies[i].printInfo();
        }



/*//        -----------------------5번 문제
        Member member = new Member();
        System.out.print("이름: ");
        member.name = sc.nextLine();
        System.out.print("나이: ");
        member.age = sc.nextInt();
        System.out.print("포인트: ");
        member.point = sc.nextInt();
        System.out.print("변경할 나이: ");
        member.setAge(sc.nextInt());
        System.out.println(member.getInfo());*/


//        #-----------------------1번 문제
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



        //---------------#2번 문제
/*        int[] arr1 = new int[5];
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
        }*/
/*        // 배열 정렬 (버블, 선택)
        int[] merge = {3, 4, 3, 9, 5, 2, 7, 4, 2, 8};
        // 버블 정렬
*//*        for (int i = merge.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (merge[j + 1] < merge[j]) {
                    int temp = merge[j];
                    merge[j] = merge[j + 1];
                    merge[j + 1] = temp;
                }
            }
        }*//*

//        선택 정렬
            for (int i = 0; i <= merge.length - 2; i--) {
            int idx = 0;
            int least = merge[i];
            for (int j = i; j <= merge.length - 1; j++) {
                if (merge[j] < least) {
                    least = merge[j];
                    idx = j;
                }
            }
            int temp = merge[i];
            merge[i] = merge[idx];
            merge[idx] = temp;
        }
        System.out.print(Arrays.toString(merge));*/

//        System.out.print(Arrays.toString(merge));
/*        for (int i = 0; i < merge.length; i++) {
            if (i == merge.length - 1 || merge[i] != merge[i + 1]) {
                System.out.print(merge[i] + " ");
            }
        }*/




/*//     --------3번 문제
        System.out.print("N 입력: ");
        int N = sc.nextInt();
        int[][] arry = new int[N][N];
        // Random 초기화
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arry[i][j] = random.nextInt(1, 101);
//                arry[i][j] = 1;
            }
        }

        int Max = arry[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(arry[i][j] + "\t");
                if (arry[i][j] > Max) {
                    Max = arry[i][j];
                    row = i; // for 밖 부분은 행이라서 i
                    col = j; // for 안 부분은 행이라서 j
                }
            }
            System.out.println();
        }
        System.out.println("최댓값: " + arry[row][col]);
        System.out.println("최댓값의 위치: ");*/



//        ----------4번 [킬러문제]
 /*       System.out.print("좌석 크기: ");
        int N = sc.nextInt();
        char[][] seats = new char[N][N];
        System.out.println("=== 극장 좌석 예약 시스템 ===");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                seats[i][j] = (i == 0 ? 'O' : 'X');
            }
            System.out.print("[" + (i == 0 ? "R" : "O") + "]");
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }
        int occupied = 0; // 예약된 자리
        System.out.println("빈 자리: " + (N * N - occupied) + " | 예약된 자리 : " + occupied);


        while(true) {
            System.out.print("1. 예약 2. 취소 3. 현황 4. 종료: ");
            int menu = sc.nextInt();
            if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (menu == 3) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print("[" + seats[i][j] + "]");
                    }
                    System.out.println();
                    System.out.println("빈 자리: " + (N * N - occupied) + " | 예약된 자리 : " + occupied);
                }
            }
            else if (menu ==  1) {
                System.out.println("예약할 행 번호: ");
                int row = sc.nextInt() - 1;
                System.out.println("예약할 열 번호: ");
                int col = sc.nextInt() - 1;
                if (seats[row][col] != 'X') {
                    seats[row][col] = 'X';
                    occupied++;
                } else {
                    System.out.println("[오류] 이미 예약된 좌석 입니다.");
                }
            }
            else if(menu == 2) {
                System.out.println("취소할 행 번호: ");
                int row = sc.nextInt() - 1;
                System.out.println("취소할 열 번호: ");
                int col = sc.nextInt() - 1;
                if (seats[row][col] == 'X') {
                    seats[row][col] = (row == 0 ? 'R' : 'O');
                    occupied--;
                }
                System.out.println((row + 1) + "행 " + (col + 1) + "열 좌석 취소 완료!");
            }
            else {
                System.out.println("없는 메뉴 입니다.");
            }
        }*/


    }
}