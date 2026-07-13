package Grammer;

public class VariableArguments {
    //1. 가변인자를 사용할려면 자료형 뒤에 ...을 써야한다.
    //2. ()안에 numbers는 int의 배열이다.
    public static void printNumbers(int... numbers) { // 가변인자의 관계는 ...을 보면 됀다.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "");
        }
        System.out.println();
    }
}
