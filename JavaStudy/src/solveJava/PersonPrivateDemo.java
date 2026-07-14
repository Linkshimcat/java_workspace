package solveJava;

import org.w3c.dom.ls.LSOutput;

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("유효하지 않는 나이입니다.");
        }
        this.age = age;
    }

}

public class PersonPrivateDemo {
    public static void main(String[] args) {
        Person info = new Person(30);
        info.setAge(30);
        System.out.println(info.getAge());
        info.setAge(-30);
    }
}
