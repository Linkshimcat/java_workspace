package chap_03;

public class _01_Operator1 {
    public static void main(String[] args) {
//        #산술연산자
        System.out.println(4 + 2); // 덧셈 (결과: 6)
        System.out.println(4 -  2); // 뺄셈 (결과: 2)
        System.out.println(4 *  2); // 곱하기 (결과: 8)
        System.out.println(4 / 2); // 나눗셈 (결과: 2)
//      (중요) 자바에선 소수점 이하는 생략하고 정수부분만 나오게 함.
        System.out.println(5 / 2); // (수학 결과값: 2.5) | (프로그래밍 결과값: 2)
//      (만약) 정수부분만 아니라, 소수부분도 포함 시키고 싶다면, 자료형 (double, float)을 선언하거나, 숫자뒤에 .0을 붙인다.
        System.out.println((double) 5 / 2); // (프로그래밍 결과값: 2.5)

//        #나머지 연산자 (%)
        System.out.println(4 % 2); // 나머지 (결과: 0)
        System.out.println(5 % 2); // 나머지 (결과: 1)

//        연산자 우선순위 (*곱하기 -> /나눗셈 -> %나머지 -> +덧셈 -> -뺄셈) 순서
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2+2) * 2); // 8 | 괄호()를 붙이면 먼저 우선적으로 연산함.


//        #증감연산자
//      (증가 연산자 전위형 증가)
        int val = 10;
        System.out.println(val);
        System.out.println(++val); // ++val은 증감연산자의 전위형이다. (값을 먼저 1증가 시킴.)
        System.out.println(val);
        int val2 = 10;
        System.out.println(val);
        System.out.println(val++); // val++은 증감연산자의 후위형이다. (val의 값을 먼저 출력 후, val의 값 1증가.)
        System.out.println(val);


    }

}
