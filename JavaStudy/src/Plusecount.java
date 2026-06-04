import java.util.Scanner;
//public class Plusecount {


class te3st {
    public static void main(String[] args) {

        //    1번 문제
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        do {
//            System.out.print("숫자 입력: ");
//            num = sc.nextInt();
//            sum += num;
//            System.out.println("합: " + sum);
//            } while (sum != 0);
//    }

        //2번 문제
//        Scanner sc = new Scanner(System.in);
//        System.out.print("곱할 dan 수를 입력하세요: ");
//        int dan = sc.nextInt();
//        for (int i = 1; i<=9; i++) {
//            System.out.println(dan + "*" + i + "=" + (dan*i));
//        }

//        //3번 문제
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=num; i++) {
//            if (i % 2 == 0) {
//                sum += 1;
//            }
//        }
//        System.out.println(sum);

//        4번 문제
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= N; i++) {
//            factorial *= i;
//        }
//        for (int i = 1; i<=N; i++) {
//            factorial *= i;
//        }
//        System.out.println(N + "!" + " = " + factorial);
//        sc.close();

//      문제 8번
//        Scanner sc = new Scanner(System.in);
//        int randomNumber = new java.util.Random().nextInt(100) + 1;
//        int fixIValue = 42; //고정값 42
//
//        int count = 0; //처음 입력은 없으니 0
//
//        while (true) { //true로 바로 무한 반복
//            count++; //입력하고 Enter시, 1증가
//            System.out.print("지금 부터 숫자 게임을 시작해볼까요?"); //문제 알림
//            int N = sc.nextInt();
//
//            if (N == fixIValue) {
//                System.out.println(S);
//                System.out.println(N + "정답입니다!");
//                break;
//            }
//
//            else if (N<fixIValue) {
//                System.out.println("더 작은 값입니다!");
//            }
//
//            else if (N>fixIValue) {
//                System.out.println("더 큰 값입니다!");
//            }
//            sc.close()
//
//        }
//
//
//
//    }


//           문제 9번
//            for (int i = 2;  i<=9; i++) {
//                for (int j = 1; j<=9; j++) {
//                    System.out.print(i  + "*" + j + "= " + (i * j) + "\n");
//                }
//            }

//           10번 문제
//             Scanner sc = new Scanner(System.in);
//             int N = sc.nextInt();
//             int result = -1;
//             if(N == 0) result= 0;
//             if(N == 1) result= 1;
//
//
//             if (N >= 2) {
//                 System.out.print("0 1");
//                 int first = 0;
//                 int second = 1;
//                 for (int i = 2; i<=N-2; i++) {
//                     int curr = first + second;
//                     first = second;
//                     second = curr;
//                     result = curr;
//                     System.out.print(curr);
//                 }
//                 sc.close();
//             }


//              5번 문제
//                Scanner sc = new Scanner(System.in);
//                System.out.print("정수 N을 입력하세요: ");
//                int N = sc.nextInt();
//                // 3의 배수면 i 대신 "Fizz" 출력
//                for (int i = 1; i<=N; i++) {
//                    if (i%15 == 0) {
//                        System.out.print("FizzBuzz ");
//                    }
//                    else if (i%3 == 0) {
//                        System.out.print("Fizz ");
//                    }
//                    else if (i%5 == 0) {
//                        System.out.print("Buzz ");
//                    }
//                    else  {
//                        System.out.print(i + " ");
//                    }
//                    System.out.println();
//                    sc.close();
//                }

//                6번 문제 - 369게임

                  Scanner sc = new Scanner(System.in);
                  System.out.print("지금 부터 369게임을 해볼까요?");
                  int N = sc.nextInt();

//
                  for (int i = 1; i<=N; i++) {
                      int n = i % 10;
                      if (n == 3 || n == 6 || n == 9) {
                          System.out.print("👏 ");
                      }
                      else  {
                          System.out.print(i + " ");
                      }
                      sc.close();
                  }

//                  나이 문제
//                    Scanner sc = new Scanner(System.in);
//                    System.out.print("나이를 입력하세요: ");
//                    int N = sc.nextInt();
//
//                    if (N >= 20) {
//                        System.out.println("성인 입니다");
//                    }
//                    else {
//                        System.out.println("미성년자 입니다.");
//                    }

//                    두 수 a,b 저장하고 더 큰 수를 출력
//                      Scanner sc = new Scanner(System.in);
//                      int a = sc.nextInt();
//                      int b = sc.nextInt();
//
//                      if (a>b) {
//                          System.out.print(++a + "\n");
//                      }
//                      if (a<b) {
//                          System.out.print(++a + "\n");
//                      }
//
//                      else if (a == b)  {
//                          System.out.print("같습니다" + "\n");
//                      }


//                    8번문제: 3건너뛰기 문제
//                      Scanner sc = new Scanner(System.in);
//                      int N = sc.nextInt();
//
//
//                      for (int i = 1; i<=N; i++) {
//                          // 3의 배수이면 건너뛰기 (Continue 이용)
//                          if (N%3 == 0) continue; {
//                              System.out.println(i + " ");
//                          }
//                          sc.close();
//                      }



//                    9번 문제: 소수판별 문제
//                      Scanner sc = new Scanner(System.in);
//                      int num = sc.nextInt();
//                      boolean isPrime = true;
//
//                      for (int i = num - 1; i>=2; i--) {
//                         if (num % i == 0) {
//                             isPrime = false;
//                             break;
//                         }
//
//                      }
//                      System.out.println(isPrime ? "소수입니다." : "소수가 아닙니다.");

//
////                      15번 문제: 콜라츠 추측
//                        Scanner sc = new Scanner(System.in);
//                        System.out.print("양수 N을 입력하세요: ");
//                        int N = sc.nextInt();
//                        int count = 0;
//
//
//                        while (true) {
//                            System.out.print(N + " ");
//                            // 1이면, 종료
//                            if(N == 1) break;
//
//                            if (N%2 == 0) {
//                                 N = N / 2;
//                             }
//
//                             else {
//                                N = N * 3 + 1;
//                            }
//                            count++;
//                        }
//                        System.out.print("\n" + count + "번 만에" + "1에 도달 하였습니다.");


    }
}