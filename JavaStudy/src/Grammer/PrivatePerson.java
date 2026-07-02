package Grammer;

public class PrivatePerson {
    // 모든 필드를 전부 private으로 지정하고

    // private은 class 내에서 접근 가능.
    private String name;

    public PrivatePerson(String name) {
        this.name = name;
    }

    // 게터, 세터 (=> 99.9% pulbic)
    // 접근은 public인 게터와 세터로 수행.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void greet() {
        System.out.println("안녕하세요");
    }

    // 간접적으로 접근 가능하다.
    public void publicGreet() {
        this.greet();
    }


}
