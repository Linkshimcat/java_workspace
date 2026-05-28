class MyStudent {
    int age;
    String name;

}


public class StudentDemo {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();
        s.age = 17;
        s.name = "이윤재";

        System.out.println("이름: " + (s.name) + ", 나이: " + (s.age) + "세");
    }
}
