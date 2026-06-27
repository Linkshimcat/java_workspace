package java_book.chap_03;

public class _02_Operator2 {
    public static void main(String[] args) {
//        복합 대입 연산자
//        예를 들어, num = num + 2;는 num += 2;로 줄일수 있다.
//       해석: 오른쪽 num + 2 더한값을 다시 왼쪽 num에 저장한다.
        int num = 10;
        num += 2;
        System.out.println(num); //12
        num -= 2;
        System.out.println(num); //10
        num *= 2;
        System.out.println(num); //20
        num /= 2;
        System.out.println(num); //10
        num %= 2;
        System.out.println(num); //0

//      복합 대입 연산자 (언제 사용함?)
//       #1: sum += count; (누적 합산)
//       #2: count += 1; (숫자를 1씩 올릴 때)
    }
}
