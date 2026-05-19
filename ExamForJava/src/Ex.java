import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);



//        String star = "*";
//
//        for(int i = 1; i<=3; i++) {
//            for(int j = 1; j<=5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i ; j++) {}
//            System.out.print("*");
//            for (int l = 1; l <= i; l++) {
//                System.out.print(l);
//            }
//            System.out.println();
//        }



//        for (int i = 1; i <= 5; i++) {
//            for (int l = 1; l <= i; l++) {
//                System.out.print(l);
//            }
//            for (int j = 1; j <= 5 - i ; j++) {}
//            System.out.print("*");
//
//            System.out.println();
//        }


        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }







//        System.out.print("학생 이름을 입력하세요: ");
//        String Name = sc.nextLine();
//        System.out.print("학교 이름을 입력하세요: ");
//        String SCName = sc.nextLine();
//        System.out.print("입력할 점수의 개수를 입력하세요: ");
//        int count = sc.nextInt();
//
//
//        int TotalScore = 0;
//        for (int i = 1; i<=count; i++) {
//            System.out.print(i + "번째 점수를 입력하세요: ");
//            int score = sc.nextInt();
//            TotalScore += score;
//        }
//
//        double AverageScore = ( TotalScore / count);
//
//
//        System.out.print("--- 결과 리포트 ---" + "\n");
//        System.out.print("학교: " +  SCName + "\n");
//        System.out.print("이름: "+ Name + "\n");
//        System.out.print("점수 총합: " +  TotalScore + "\n");
//        System.out.print("평균 점수: " + AverageScore);

    }
}
