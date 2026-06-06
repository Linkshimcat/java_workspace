package chap_02;

public class _06_TypeCasting {
    public static void main(String[] args) {
//        컴퓨터의 10과 10.0은 서로 다르다. (int(정수) 와 double(실수)은 엄격하게 구분해 저장함.)
//        상황에 맞게 컴퓨터의 자료형을 바꾸는것을 (형 변환 TypeCasting)이라고 함.

        int score = 98; // 정수 98 score
        System.out.println(score); //(정수)98 출력
        System.out.println((float)score); // (float) 소수 98.0 출력
        System.out.println((double)score); // (double) 소수 98.0 출력


//        하지만, 실수를 정수로 바꿀땐, 데이터 손실 (Data loss)현상이 발생한다.
        float grade = 93.3f;
        double grade2 = 98.8;
        //  이 처럼 실수 -> 정수로 형변환 시키면, 소수점 이하 부분만 사라지게 된다.
//       (꼭) 그래서 반드시 개발자가 (int)처럼 변환할 자료형을 명시해야 한다.
        System.out.println((int)grade); //93 출력
        System.out.println((int)grade2); // 98 출력

//        #정수와 실수 같이 계산하기
        score = 98 + (int)98.8; // 98 + 98
        System.out.println(score); //196 출력
        grade2 =  10 + 2.2; // 10.0 + 2.2
        System.out.println(grade2); // 12.2 출력
        score = (int)grade2; // <- double인 grade2를 int로 형 변환 명시




    }
}
