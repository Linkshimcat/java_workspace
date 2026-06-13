package chap_03;

public class Width {
    public static void main(String[] args) {
        int FA = 68;
        int FB = 75;
        int FC = 72;

        String rsult = ((FB > FA) || (FB < FC)) ? ("꼴찌의 몸무게는 " + FB + "kg입니다.") : ("날신한 몸무게는" + FA + "kg입니다.");
        System.out.println(rsult);
    }
}
