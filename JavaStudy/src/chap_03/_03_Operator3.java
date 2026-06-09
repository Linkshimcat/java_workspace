package chap_03;

public class _03_Operator3 {
    public static void main(String[] args) {
//        비교 연산자
        System.out.println(5 > 3); // 5가 3보다 크므로, true
        System.out.println(5 >= 3); //5가 3보다 크거나 같으므로, true
        System.out.println(5 == 5); // 5는 5와 같으므로 true
        System.out.println(3 < 5); // 3이 5보다 작으므로, true
        System.out.println(3 <= 5); // 3이 5보다 작거나 같으므로, true

//        OR 연산자 (기호: || )
        System.out.println((5 > 3) || (5 < 2)); // (5 > 3) true , (5 < 2) false [or는 둘중 하나라도 true면 결과는 true]
        System.out.println((5 > 3) || (5 > 1));
        System.out.println((5 < 3) || (5 < 2)); // 둘다 조건이 true의 조건이 없으므로 결과는 false로 뜸

//        AND 연산자 (기호: && )
        System.out.println((10 > 2) && (10 > 9) && (10 > 1)); // AND연산자는 모든 조건이 true일때 결과값을 true로 뜸.
//      하지만, (10 > 2) && (10 > 9) && (10 > 11) 에서 (10 > 11)은 false이므로, 3중 1하나라도 false여서 결과값은 false로 뜸.

//      NOT 연산자 (기호: ! )
        System.out.println(!true); // NOT연산자는 한마디로 true 인것을 false로, false인 것을 true로 (반전 시킴)
        System.out.println(!(5 == 5)); // 조건 (5 == 5)는 같으므로 true이지만, !의 기호가 앞에 붙는 순간, false로 반전됌.
    }
}
