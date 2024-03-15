package 사용자정의예외클래스;

public class Main {
    public static void main(String[] args) {
        try {
            // 예외 발생
            throw new CustomException("Custom exception occurred.");
        } catch (CustomException e) {
            // 예외 처리
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
