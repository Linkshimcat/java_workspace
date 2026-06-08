package Grammer;

public class Var_test {
    public static void main(String[] args) {
//      강제 형 변환
        int a = 12;
        byte b = (byte)a; // byte + byte는 int로 취급
        byte d = (byte)(a+b);
        System.out.println("a+b: " + d);
        
    }
}
