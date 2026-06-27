package java_book.chap_02;

public class _07_TypeOfCasting {
    public static void main(String[] args) {
//        #숫자를 문자열로 바꾸기
//        #1 String.valueOf() 사용하기 (어떤 자료형이든 문자열로 바꿔주는 범용적인 방법)
        String s1 = String.valueOf(10); // 10 -> "10"
        String s2 = String.valueOf(94.2); // 94.2 -> "94.2"
        String s3 = String.valueOf(true); // boolean인 true를 문자열로 가능.
        System.out.println(s1); // "10" 출력
        System.out.println(s2); // "94.2" 출력
        System.out.println(s3); // true 출력

//        #2 Integer.toString() 또는 Double.toString() 사용하기
//        자료형에 맞게 사용가능.
        String b1 = Integer.toString(20);
        String b2 = Double.toString(2.2);
        System.out.println(b1); //20은 숫자처럼 보이나, 문자열 20을 의미함.
        System.out.println(b2);
//        (주의)문자열을 연산불가능하다.
        System.out.println("당신의 중간고사 평균 점수는: " + s2 + "입니다."); //다른 문자열과 붙일때 사용가능.

//        #3 문자열을 숫자로 바꾸기.
//        -정수값을 문자열로 바꿀때: Integer.parseInt()
//        -실수값을 문자열로 바꿀떄: Double.parseDouble()
//        *여기서 parse는 '분석해서 의미를 알아내다'의 의미로 문자열을 분석해 그 안에 들어있는 숫자 값을 뽑아낸다는 의미.
        int i = Integer.parseInt("10"); // "10" -> 10
        double d = Double.parseDouble("32.2"); // "32.2" -> 32.2
        System.out.println(i);
        System.out.println(d);
//        문자열을 숫자로 바꿨으면 자유롭게 연산 가능.
        System.out.println(i + 10); // 변수 i + 10 = 20
        System.out.println(d + 2); // 변수 d + 2 = 34.2
//        *(주의) 문자열을 숫자로 바꿀때의 실수
        int s = Integer.parseInt("문자열"); //컴파일 에러 (문자열이 실제 숫자 인지 확인 해야함.)

    }
}
