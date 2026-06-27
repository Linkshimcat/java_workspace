package java_book.chap_03;

public class _05_Operator5 {
    public static void main(String[] args) {
//        조건 삼항 연산자는 '조건문을 단 한 줄로 표현하는 연산자로, 코드를 훨씬 깔끔하게 만들어줌.
        int x = 10;
        int y = 4;
        int MAX = (x > y) ? x : y; // 10이 4보다 크기 때문에, x는 true (참)에 속하기 때문에 10을 출력함.
        System.out.println(MAX);
//        또한 삼항 연산자는 Int뿐만 아니라, boolean, String 등 가능.
        boolean MX = (x > y) ? true : false;
        System.out.println(MX);
        String SN = (x > y) ? "같아요." : "달라요.";
        System.out.println(SN);
    }
}
