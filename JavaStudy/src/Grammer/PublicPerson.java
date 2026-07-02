package Grammer;

// class 앞에는 *무조건 public이 붙는다고 생각하기.
public class PublicPerson {
    // 필드 앞에 접근제어자 붙일 수 있음.
    public String name;

    // 생성자 앞에도 접근제어자 붙일 수 있음 (생성자 앞에는 99.9% public)
    public PublicPerson(String name) {
        this.name = name;
    }


    //메서드 앞에도 접근제어자 붙일 수 있음.
    public void greet() {
        System.out.println("안녕");
    }
}
