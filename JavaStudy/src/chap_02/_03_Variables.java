package chap_02;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이윤재";
        int hour = 15;
        System.out.println(name + " 님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + " 님, 배송이 완료되었습니다.");
        double score = 90.5;
        char grade = 'A';
        name = "강백호"; // 변수는 재할당이 가능함. (이윤재 -> 강백호)2
        System.out.println(name + " 님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");
        boolean pass = true;
    }
}
