import java.util.Scanner;
public class Tax_calculate {
    public static void main(String[] args) {

//        #직원 연봉 문제
//        Scanner sc = new Scanner(System.in);
//        System.out.print("현 연봉을 입력하세요: ");
//        double currentSalary = sc.nextDouble(); //현 연봉
//        System.out.print("근무평가등급을 입력하세요: ");
//        sc.nextLine();
//        String rating = sc.nextLine();
//        double raise = 0.0; //연봉 인상액
//        double newSalary; // 새 연봉
//
//        if (rating.equals("우수")) {
//            raise = currentSalary * 0.06;
//        }
//        else if (rating.equals("보통")) {
//            raise = currentSalary * 0.04;
//        }
//        else if (rating.equals("불량")) {
//            raise = currentSalary * 0.02;
//        }
//
//        System.out.println("연봉인상액: " +  (int)(raise));
//        System.out.println("새 연봉인상액: " +  (int)(currentSalary+raise));


//        for문 (제어문 , 반복문)
//        #for문으로 1부터 10까지 수의 곱을 출력
//        long result = 1;
//        for (int i = 1; i<=10; i++) {
//            result *= i;
//        }
//        System.out.print(result);


//        #for문 1~100사이의 짝수 출력
//        int Num = 100;
//        for(int i = 1; i<=100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        #4번 급여 계산문제
//        final int leesmoney = 9860;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시급을 입력하세요: ");
//        int tmoney = sc.nextInt();
//        System.out.print("근무시간을 입력하세요: ");
//        int times = sc.nextInt();
//        int minpay = leesmoney *  times;
//        int actualPay = tmoney * times;
//        System.out.println("최저시급 기준 급여: " + minpay);
//        System.out.println("실제 급여:      " + actualPay);
//        System.out.println("차이           :" + (actualPay - minpay) + "원");
//        sc.close();


//        #7번 문제 직사각형 넓이와 둘레
//        Scanner sc = new Scanner(System.in);
//        System.out.print("직사각형 가로: ");
//        int rows = sc.nextInt(); // 가로값
//        System.out.print("직사각형 세로: "); //세로값
//        int cols = sc.nextInt();
//        System.out.println("직사각형 넓이: "+ rows*cols);
//        System.out.println("직사각형 둘레: " + (2 * (rows + cols)));


//        # n입력받아 For문 사용 1-2+3-4+5....n
//        Scanner sc = new Scanner(System.in);
//        System.out.print("N을 입력: ");
//        int Number = sc.nextInt();
//        System.out.print(1);
//        for (int i = 2; i<=Number; i++) {
//            if (i % 2 == 0) {
//                System.out.print("-"+ i);
//            }
//            else {
//                System.out.print("+" + i);
//            }
//        }


//        #8번 문제 - 원기둥 부피와 겉넓이
//        final double pi = 3.14;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("원기둥 반지름: ");
//        int r = sc.nextInt();
//        System.out.print("원기둥 높이: ");
//        int h = sc.nextInt();
//        System.out.println("부피 = " + (pi * r*r * h));
//        System.out.println("겉넓이 = " + (2 * pi * r*r + 2 * pi * r * h));



//        #9번
//        Scanner sc = new Scanner(System.in);
//        System.out.print("원금: ");
//        int originPay = sc.nextInt();
//        System.out.print("연이율: ");
//        double percentPay = sc.nextDouble();
//        System.out.print("기간(년): ");
//        int year = sc.nextInt();
//        double finals = originPay * percentPay * year;
//        System.out.println("이자 = " + (originPay * percentPay * year));
//        System.out.println("최종 금액 = " + (originPay + finals));

//        #Switch문 [5번]
//        Scanner sc = new Scanner(System.in);
//        System.out.print("해당 요일을 입력: ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 : System.out.println("월요일"); break;
//            case 2 : System.out.println("화요일"); break;
//            case 3 : System.out.println("수요일"); break;
//            case 4 : System.out.println("목요일"); break;
//            case 5 : System.out.println("금요일"); break;
//            case 6 : System.out.println("토요일"); break;
//            case 7 : System.out.println("일요일"); break;
//            default : System.out.println("잘못된 입력");
//        }


//        #Switch [6]번 계절 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.print("월을 입력: ");
//        int month = sc.nextInt();
//
//        switch (month) {
//            case 3, 4, 5 : System.out.println("봄"); break;
//            case 6, 7, 8 : System.out.println("여름"); break;
//            case 9, 10, 11 : System.out.println("가을"); break;
//            case 12, 1, 2 : System.out.println("겨울"); break;
//            default : System.out.println("잘못된 입력");
//        }


//      #반복문
//        Scanner sc = new Scanner(System.in);
//        System.out.print("개수 n 입력: ");
//        int n = sc.nextInt();
//        int min = n; //최솟값
//        int max = 0; //최대값
//        for (int i = 1; i<=n; i++) {
//            int num = sc.nextInt();
//            if(num > max) max = num;
//            if(num < min) min = num;
//        }
//        System.out.println("최대값: " + max + " 최솟값: " + min);




    }
}
