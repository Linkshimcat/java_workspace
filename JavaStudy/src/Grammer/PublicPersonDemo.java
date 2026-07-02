package Grammer;

import java.security.spec.RSAOtherPrimeInfo;

public class PublicPersonDemo {
    public static void main(String[] args) {
        PrivatePerson person = new PrivatePerson("철수");
//        System.out.println(person.name); private이라 오류.
        System.out.println(person.getName());
        // person.name = "영희";
        person.setName("영희");



//        PublicPerson person = new PublicPerson("철수");


    }
}
