package Grammer;

public class VarargsDemoUsage {
    public static void main(String[] args) {
        VariableArguments.printNumbers();
        VariableArguments.printNumbers(1);
        VariableArguments.printNumbers(1, 2, 2, 3, 4, 5, 6, 7, 8, 9);

        String.format("%d %s %f", 100, "Hello", 1.2); // 첫번째는 String, 뒤에는 가변인자
    }
}
