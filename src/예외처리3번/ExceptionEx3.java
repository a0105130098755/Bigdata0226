package 예외처리3번;

public class ExceptionEx3 {
    public static void main(String[] args) {
        String text = null;

        try {
            // null 참조를 사용하여 문자열의 길이 출력
            int length = text.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
    }
}

