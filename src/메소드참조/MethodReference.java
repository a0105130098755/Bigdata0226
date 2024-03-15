package 메소드참조;


interface StringConverter {
    String convert(String str);
}
class StringHelper {
    // 대문자로 변환하는 메소드
    static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // 소문자로 변환하는 메소드
    static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
public class MethodReference {
    public static void main(String[] args) {
        // 메소드 레퍼런스를 사용하여 대문자로 변환하는 함수 생성
        StringConverter upperCaseConverter = StringHelper::toUpperCase;

        // 메소드 레퍼런스를 사용하여 소문자로 변환하는 함수 생성
        StringConverter lowerCaseConverter = StringHelper::toLowerCase;

        // 문자열 변환
        String input = "Hello, World!";
        String upperCaseOutput = upperCaseConverter.convert(input);
        String lowerCaseOutput = lowerCaseConverter.convert(input);

        // 결과 출력
        System.out.println("Upper Case: " + upperCaseOutput); // 출력: UPPER CASE: HELLO, WORLD!
        System.out.println("Lower Case: " + lowerCaseOutput); // 출력: lower case: hello, world!
    }
}
