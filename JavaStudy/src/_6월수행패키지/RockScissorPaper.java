package _6월수행패키지;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        int dice = ThreadLocalRandom.current().nextInt(1, 4); // 1 ~ 3
        double ranDouble = ThreadLocalRandom.current().nextDouble();
        Scanner sc = new Scanner(System.in);

        int[] status = new int[3];
        String[] names = {"가위", "바위", "보"};

        System.out.println("===== 가위바위보 =====");
        System.out.println("1. 가위");
        System.out.println("2. 바위");
        System.out.println("3. 보");
        System.out.println("4. 종료");

        while (true) {
            System.out.print("메뉴 선택: ");
            int choose = sc.nextInt();

            if (choose == 4) {
                System.out.println("전적 - 승: " + status[0] + " 패: " + status[1] + " 무: " +  status[2]);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choose < 1 || choose > 3) {
                System.out.println("잘못된 메뉴입니다.");
                System.out.println();
                continue;
            }

            int com = (int)(Math.random() * 3) + 1;
            System.out.println("나: " + names[choose - 1] + " / 컴퓨터: " + names[com - 1]);

            if (choose == com) {
                System.out.println("무승부");
                status[2]++;
            } else if ((choose == 1 && com == 3) || (choose == 2 && com == 1) || (choose == 3 && com == 2)) {
                System.out.println("승리");
                status[0]++;
            } else {
                System.out.println("패배");
                status[1]++;
            }
            System.out.println();

        }
    }
}
