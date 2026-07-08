class Member {
    // 필드 3개
    String name; // 회원 이름
    int totalSpent; // 총 구매 금액
    String grade; // 등급

    Member(String name, int totalSpent) { //메개변수 있는 생성자
        this.name = name;
        this.totalSpent = totalSpent;

        // 처음엔 세터 써서 해보니깐(바보같이 ㅎ), null이 떠서 문제가 생기고,
        // 메개변수 있는 생성자 안에서 totalSpent 접근해 if else 조건을 확인후 VIP , GOLD를 정함.
        if (totalSpent >= 500000) { // 총 구매 금액이 500000 이상이면 VIP
            this.grade = "VIP";
        }
        else {
            this.grade = "GOLD"; // 그렇지 않다면, GOLD
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Member[] info = new Member[3]; // Member라는 클래스 배열 생성 및 초기화.
        info[0] = new Member("김철수", 600000); // 0번째 값 접근
        info[1] = new Member("이영희", 350000); // 1번째 값 접근
        info[2] = new Member("박민수", 520000); // 2번째 값 접근
        System.out.println("--- VIP 회원 구매 금액 정산 ---");
        int sum = 0;
        for (Member s : info) { // 향상된 for문을 이용함.
            if (s.grade.equals("VIP")) { // Member안에 있는 grade가 VIP와 문자열이 정확히 같은지 확인하기 위해 equals 사용
                sum += s.totalSpent; // 참 일 경우, sum 과 s 값 대입연산자 해서 sum에 최종적으로 값 저장.
            }
        }
        System.out.println("VIP 회원 총 구매 금액 합계: " + sum + "원");
    }

}
