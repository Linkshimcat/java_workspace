package _6월수행패키지;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class RandomCube {
    public static void main(String[] args) {
        int dice = ThreadLocalRandom.current().nextInt(1, 7); // 1 ~ 6
        double ranDouble = ThreadLocalRandom.current().nextDouble();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("===== 주사위 시뮬레이터 =====");
        System.out.println("1. 주사위굴리기");
        System.out.println("2. 종료");
        while (true) {
            System.out.print("메뉴 선택: ");
            int MenuChoose = sc.nextInt();
            count++;
            System.out.println("결과: " + dice);

            if (MenuChoose == 2) {
                System.out.println("총 " + count + "번 굴렸습니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            }

//            else {
//                System.out.println("잘못된 결과입니다.");
//            }
        }

    }
}
