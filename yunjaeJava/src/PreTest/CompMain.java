package PreTest;
import java.util.Scanner;

class Complex {
    private int real;
    private int imagin;

    Complex(int real, int imagin) {
        this.real = real;
        this.imagin = imagin;
    }

    Complex(Complex comp1, Complex comp2) {
        this.real = comp1.real + comp2.real;
        this.imagin = comp1.imagin + comp2.imagin;
    }

    void print() {
        if (this.real != 0) System.out.print(this.real);
        if(Math.abs(this.imagin) == 0) System.out.print("i");
        else if(this.imagin > 0) {
            if(real == 0) System.out.print(this.imagin + "i");
            else System.out.println(" + " + this.imagin + "i");
        }
        else if(this.imagin < 0) System.out.print(" - " + Math.abs(imagin) + "i"); // Math.abs에서 abs는 절대값
        if (this.real == 0 && this.imagin == 0) System.out.println("0");
        System.out.println();
      /*  if (this.imagin < 0) {
            System.out.println(this.real + " - " + Math.abs(this.imagin) + "i");
        } else if (this.imagin == 0) {
            System.out.println(this.real);
        } else {
            System.out.println(this.real + " + " + this.imagin + "i");
        }*/
    }

}

public class CompMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 복소수 입력: ");
        int real = sc.nextInt();
        int imagin = sc.nextInt();
        Complex comp1 = new Complex(real, imagin);
        System.out.println("두 번째 복소수 입력: ");
        real = sc.nextInt();
        imagin = sc.nextInt();
        Complex comp2 = new Complex(real, imagin);
//        Complex comp3 = new Complex(comp1.real + comp2.real, comp1.imagin + comp2.imagin); // comp3은 comp1 과 comp2의 최종 결과합
        Complex comp3 = new Complex(comp1, comp2); // 위에 클래스 오버라이딩 해서 객체 생성함.
        System.out.print("결과: ");
        comp3.print();
    }
}
