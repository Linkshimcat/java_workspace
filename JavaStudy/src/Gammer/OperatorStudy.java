package Gammer;

public class OperatorStudy {
    public static void main(String[] args) {

        // 1. 기본 산술 연산
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3  ← 정수 나눗셈! a = 10, b = 3 -> 10/3 = 몫은 3
        System.out.println("a % b = " + (a % b)); // 1
        System.out.println();

        // 2. 정수 나눗셈 vs 실수 나눗셈 (가장 많이 낚임)
        System.out.println("10 / 3   = " + (10 / 3));   // 3
        System.out.println("10 / 3.0 = " + (10 / 3.0)); // 3.3333...
        System.out.println("10.0 / 3 = " + (10.0 / 3)); // 3.3333...

        // 변수로 나눌 때 - 리터럴과 달리 실수 결과를 원하면 명시적 형변환 필요
        int x = 7, y = 2;
        System.out.println("x / y            = " + (x / y));           // 3   ← int / int, 정수 나눗셈
        // x를 명시적으로 double 변환 → 피연산자가 double이므로 y도 자동으로 double로 승격됨
        System.out.println("(double)x / y    = " + ((double) x / y));  // 3.5 ← double / double
        // 먼저 int / int 정수 나눗셈 후 결과를 double로 변환 → 소수점 이미 손실
        System.out.println("(double)(x / y)  = " + ((double)(x / y))); // 3.0 ← (int 나눗셈 결과) → double
        System.out.println();

        // 3. 오버플로우 - short 범위 초과
        short max = Short.MAX_VALUE;  // 32,767
        System.out.println("MAX_VALUE     = " + max);
        System.out.println("MAX_VALUE + 1 = " + (short)(max + 1)); // -32768 ← 오버플로우!
        System.out.println("int로 처리    = " + (max + 1));        // 정상
        System.out.println();

        // 4. 나머지 연산자 활용 (짝수/홀수 판별)
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "은(는) " + (i % 2 == 0 ? "짝수" : "홀수"));
        }

        System.out.println();

        // 5. 문자열 + 숫자 더하기 함정
        System.out.println("결과: " + 2 + 3);   // "결과: 23"  ← 함정! (중요)
        System.out.println("결과: " + (2 + 3)); // "결과: 5"   ← 괄호로 해결
    }
}

    // 관계연산자 정리
    class RelationalOperatorsDemo {
    public static void main(String[] args) {
        // 1. 기본 관계 연산자
        int a = 10, b = 3;
        System.out.println("a > b  : " + (a > b));  // true
        System.out.println("a < b  : " + (a < b));  // false
        System.out.println("a >= b : " + (a >= b)); // true
        System.out.println("a <= b : " + (a <= b)); // false
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println();

        // 2. 낚시 포인트 - 실수 비교 (부동소수점 오차)
        double x = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 : " + (x == 0.3)); // false ← 낚시!
        System.out.println("0.1 + 0.2 결과   : " + x);          // 0.30000000000000004

        // 실수 비교는 오차 범위(epsilon)로 처리해야 함
        double epsilon = 1e-9;
        System.out.println("오차 범위 비교   : " + (Math.abs(x - 0.3) < epsilon)); // true


        double target = 0.3;
        double n1 = 0.1;
        double n2 = 0.2;
        double absDiff = Math.abs(target - (n1+n2));
        System.out.println(absDiff);

        // absDiff 값에는 양수인 오차값(ex: 0.00000000000000004)이 들어감
        if (absDiff < epsilon) {
            System.out.println("두 값이 같다.");
        }

        if (n1 + n2 == target) {
        }
        if (Math.abs(target - (n1 + n2)) < epsilon) {
        }

        }
    }