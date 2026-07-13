package Grammer;

// Mini Solve
public class StringRepeater {
    public static void repeat(int count, String... args) { // 가변인자는 맨 뒤에 있어야 한다.
        String out = "";
        for (int i = 0; i < args.length; i++) {
            out += args[i];
        }
        for (int i = 0; i < count; i++) {
            System.out.println(out + " ");
        }
        System.out.println();
    }
}
