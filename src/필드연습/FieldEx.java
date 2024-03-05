package 필드연습;

public class FieldEx {
    // 정수형 필드 선언
    private int integerValue;

    // 문자열 필드 선언
    private String stringValue;

    // 부동 소수점 숫자 필드 선언
    private double doubleValue;

    // 논리형 필드 선언
    private boolean booleanValue;

    public static void main(String[] args) {
        // FieldExample 클래스의 객체 생성
        FieldExample example = new FieldExample();

        // 필드 값 설정
        example.integerValue = 10;
        example.stringValue = "Hello, World!";
        example.doubleValue = 3.14;
        example.booleanValue = true;

        // 필드 값 출력
        System.out.println("Integer Value: " + example.integerValue);
        System.out.println("String Value: " + example.stringValue);
        System.out.println("Double Value: " + example.doubleValue);
        System.out.println("Boolean Value: " + example.booleanValue);
    }
}

