// 1211 이윤재

package proj1211.A;
import java.util.Scanner;

class Member {
    String name;
    int age;
    int point;

    Member(String name, int age, int point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("유효하지 않은 나이입니다.");
        } else {
            this.age = age;
        }
    }

    String getInfo() {
        return "이름: " + name + " | 나이: " + age + "세 | 포인트: " + point;
    }
}

public class Memeber_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 :");
        String namePeople = sc.nextLine();
        System.out.print("나이 :");
        int agePeople = sc.nextInt();
        System.out.print("포인트 :");
        int pointPeople = sc.nextInt();

        Member people = new Member(namePeople, agePeople, pointPeople);
        System.out.println(people.getInfo());

        System.out.print("변경할 나이: ");
        int cdAge = sc.nextInt();

        people.setAge(cdAge);
        System.out.println(people.getInfo());
    }
}
