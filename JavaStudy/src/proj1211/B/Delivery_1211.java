//1211 이윤재
package proj1211.B;

import java.util.Scanner;

class Delivery {
    String recipient;
    int fee;
    int weight;

    Delivery(String recipient, int fee, int weight) {
        this.recipient = recipient;
        this.fee = fee;
        this.weight = weight;
    }

    void setFee(int fee) {
        if (fee < 0) {
            System.out.println("유효하지 않은 요금입니다.");
        }else {
            this.fee = fee;
        }
    }

    String getInfo() {
        return "수령인: " +  recipient + " | " + "요금: " + fee + "원 | " + "무게: " + weight + "kg";
    }
}
public class Delivery_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수령인: ");
        String name = sc.next();
        System.out.print("요금: ");
        int fee = sc.nextInt();
        System.out.print("무게: ");
        int weight = sc.nextInt();

        Delivery infos = new Delivery(name, fee, weight);
        System.out.println(infos.getInfo());
        System.out.print("변경할 요금: ");
        int cdFee = sc.nextInt();
        infos.setFee(cdFee);
        System.out.println(infos.getInfo());
    }
}
