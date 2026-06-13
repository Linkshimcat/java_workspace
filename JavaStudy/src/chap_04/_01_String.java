package chap_04;

public class _01_String {
    public static void main(String[] args) {
        String s = "HELLO WORLD! GITHUB.";
        System.out.println(s);
//        문자열의 길이를 구할 때, 눈에 보이는 글자 뿐만아니라, 공백과 마침표, 쉼표 등 특수 문자 등등 모든 글자 수에 포함한다.
        System.out.println(s.length()); // 문자열 s의 문자열 길이를 알고 싶을떈, length()를 사용한다.
//        참고: 변수 s에 저장한 문자열은 공백과 마침표,느낌표를 포함해 20글자를 알 수 있음.


//        # 대,소 문자 마음대로 바꾸기
        String a = "I like Hot6 and Monster";
        System.out.println(a.toUpperCase()); // 모든 글자를 대문자로 바꿔줌. ( toUpperCase() )
        System.out.println(a.toLowerCase()); // 모든 글자를 소문자로 바꿔줌. ( toLowerCase() )
//        # 특정 문자열 포함 여부 확인하기 (Contains)
//        설명: 변수 a라는 문자열 뒤에 contains()라는 매서드를 사용하면 쉽다. ()에는 특정 문자열 키워드를 넣으면 됨.
        System.out.println(a.contains("Hot6")); // Hot6라는 키워드의 문자열이 포함돼어있으므로, true
        System.out.println(a.contains("x")); // x라는 키워드는 문자열에 없기에, false로 뜸

//        #문자열 바꾸기
//        설명: 문자열의 일부 내용을 바꾸고 싶을땐 replace()를 사용하면 됨.
//        형식: 문자열_변수.replace("바꾸려는 문자열", "바꿀 문자열"); 한마디로 A to -> B 형식?
        String s2 = "I like JAVA and Python and Lua.";
        System.out.println(s2.replace(" and", ",")); // 출력 결과 and가 ,로 바뀌는것을 알 수 있음.
//      (I like JAVA and Python and Lua. -> I like JAVA, Python, Lua.)



//        문자열 비교하기
//        - 문자열 비교는 로그인,회원가입, 검색 기능 등 자주 사용하는 중요한 기술이다.
        String a1 = "JAVA";
        String a2 = "Github";
        System.out.println(a1.equals(a2)); // a1과 a2가 서로 비슷한지 비교 [ JAVA = Github 는 서로 다르므로, false ]
        System.out.println(a1.equals("JAVA")); // a1의 저장된 변수와 equals("JAVA")는 똑같은 문자열이다.
//        참고로 equals는 문자열 안에 내용이 무조건 똑같아야 함.

//        #대소문자 무시하고 비교
//        만약 대소문자를 무시하고 값을 비교하고 싶다면, equalsIgnoreCase()를 사용한다.
        System.out.println(a1.equalsIgnoreCase("java")); // a1의 JAVA 와 java의 대소문자의 비교를 무시하고 값을 비교함.
//        정리하면:
//        equals: 대문자, 소문자 무조건 정확히 똑같아야 함.
//        equalsIgnoreCase: 대소문자 구분없이 같으면 true

    }
}
