package chap_02;

public class _04_SpecialVariables {
    public static void main(String[] args) {
        double d = 3.14123456789; // (자바에서 실수의 기본형은 double임)
        float f = 3.14123456789f; // 숫자 뒤에 F 또는 f 접미사 반드시 붙이기! f는 float을 의미함.
        System.out.println(d);
        System.out.println(f);
        long l = 1000000000000L; // 0이 12개인 큰 수
        System.out.println(l); // (정수의 기본형은 int지만, long으로 했을때 무조건 숫자 뒤에 접미사 L 또는 l 붙이기!)
        long s = 10_0000_000L; // 코드 읽기 편하기 위해 숫자나 너무 길면 언더스코어로 구분 가능 (컴파일러 영향 없음)
    }
}
