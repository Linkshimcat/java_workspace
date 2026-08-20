package PreTest;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int cnt = 0;
        while(temp > 0) {
//            반복문으로 temp를 10으로 나누기
            temp = temp / 10;
            cnt++;
        }
        int[] data = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            data[i] = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(data[i]);
        }

    }
}
