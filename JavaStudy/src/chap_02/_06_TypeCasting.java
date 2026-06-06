package chap_02;

public class _06_TypeCasting {
    public static void main(String[] args) {
//        컴퓨터의 10과 10.0은 서로 다르다. (int 와 double은 엄격하게 구분해 저장함.)
//        상황에 맞게 컴퓨터의 자료형을 바꾸는것을 (형 변환 TypeCasting)이라고 함.

        int score = 98;
        System.out.println(score); //(정수)98 출력
        System.out.println((float)score); // (float) 소수 98.0 출력
        System.out.println((double)score); // (double) 소수 98.0 출력
    }
}
