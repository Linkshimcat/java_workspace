package solveJava;
import java.util.Scanner;

class Contact {
    String address;
    String phone;
    String email;

//    생성자 3개 만들기
    Contact(String address, String phone, String email) {
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

//    매개변수 생성자
     Contact(String address, String phone) {
        this(address, phone, "없음"); //this 키워드 사용
    }

//    기본 생성자
    Contact() {
        this("미정", "미정"); //this 키워드 사용
    }


    String getInfo() {
        return address + " / " + phone + " / " + email;
    }

}

public class ThisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact info = new Contact();
        System.out.println(info.getInfo());
        info.address = "서울";
        info.address = "010-1234-5678";
        System.out.println(info.getInfo());
        info.address = "부산";
        info.phone = "010-9999-0000";
        info.email = "hong@test.com";
        System.out.println(info.getInfo());
        info.address = sc.nextLine();
        info.phone = sc.nextLine();
        info.email = sc.nextLine();
        System.out.println(info.getInfo());
    }

}
