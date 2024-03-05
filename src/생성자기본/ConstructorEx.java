package 생성자기본;

public class ConstructorEx {
    private int intValue;
    private String stringValue;

    // 생성자(Constructor)
    public ConstructorEx(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // 필드 값 반환하는 메소드
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static void main(String[] args) {
        // 생성자를 이용하여 객체 생성
        ConstructorEx example = new ConstructorEx(10, "Hello");

        // 객체의 필드 값 출력
        System.out.println("Integer Value: " + example.getIntValue());
        System.out.println("String Value: " + example.getStringValue());
    }
}

