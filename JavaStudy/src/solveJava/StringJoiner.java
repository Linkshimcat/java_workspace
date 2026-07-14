package solveJava;

class StringJoiner2 {
    static String join(String separator, String... words) {
        if (words.length == 0) {
            return "";
        }
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            result += separator + words[i];
        }
        return result;
    }
}

public class StringJoiner {
    public static void main(String[] args) {
        System.out.println(StringJoiner2.join("-", "Java", "Python", "C++"));
        System.out.println(StringJoiner2.join(", ", "홍길동", "김철수", "이영희"));
        System.out.println(StringJoiner2.join("|", "one", "two", "three", "four"));
    }
}