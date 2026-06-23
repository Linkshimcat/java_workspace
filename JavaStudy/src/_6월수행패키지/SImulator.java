package _6월수행패키지;
import java.util.Random;
import java.util.Scanner;

class GachaMachine {
    int pullCount = 0;
    int[] counts = {0, 0, 0};
    String[] result = {"일반", "희귀", "전설"};

    String pull() {
        pullCount++;
        Random random = new Random();
        int num = random.nextInt(100); // 0부터 99까지의 난수 생성

        int gradeIndex = 0; // 뽑힌 등급의 인덱스를 저장할 변수

        // 범위 검사하여 등급 결정
        if (num >= 0 && num <= 69) {
            counts[0]++;
            gradeIndex = 0;
        }
        else if (num >= 70 && num <= 94) {
            counts[1]++;
            gradeIndex = 1;
        }
        else if (num >= 95 && num <= 99) { // else if로 수정하여 효율성 높임
            counts[2]++;
            gradeIndex = 2;
        }

        // result 배열에서 해당하는 인덱스의 문자열을 반환
        return result[gradeIndex];
    }

    void printStats() {
        System.out.println("총 뽑기 횟수: " + pullCount + "회");
        for (int i = 0; i < counts.length; i++) {
            // result[i] 형태로 배열의 각 요소를 가져와야 합니다.
            System.out.println(result[i] + ": " + counts[i] + "회");
        }
    }
}

public class SImulator { // Simulator 오타는 그대로 유지(파일명과 맞춰야 하므로)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 가챠 시뮬레이터 =====");
        System.out.println("1. 뽑기");
        System.out.println("2. 결과 통계 보기");
        System.out.println("3. 종료");
        GachaMachine Machine = new GachaMachine();

        while (true) {
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();

            if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (menu == 2) {
                Machine.printStats();
                // 기존의 break; 를 제거하여 통계를 본 후에도 계속 진행되도록 수정
            }
            else if (menu == 1) {
                String result = Machine.pull();
                System.out.println("결과: " + result);
            }
            else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
        sc.close(); // Scanner 자원 해제
    }
}