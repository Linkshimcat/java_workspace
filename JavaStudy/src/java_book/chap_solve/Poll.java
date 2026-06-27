package java_book.chap_solve;

public class Poll {
    public static void main(String[] args) {
        int[] arry = {85, 90, 75, 100, 95};

        int sum = 0;
        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double)(sum / arry.length));
    }
}
