package java_book.chap_02;

public class _05_Constants {
    public static void main(String[] args) {
//        Final 키워드를 안쓸때
        /*String KR_code = "+82";
        KR_code = "+8282"; // 변수 값 재할당
        System.out.println(KR_code);*/

//        Final 키워드 사용
        /*final String KR_code = "+82"; //  final: "마지막"의 의미로 이 값은 최종값이니, 더 이상 바꾸지마!의 의미.
        KR_code = "+8282"; // 라인 오류
        System.out.println(KR_code); 컴파일 오류 */

//        Final이 쓰이는 예시 (한번 정해지면, 값은 바꿀수 없는것들)
        /*final String birthday = "2010.12.12";
        final double pi = 3.141592;*/
    }
}
