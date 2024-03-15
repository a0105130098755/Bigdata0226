package 사용자정의예외클래스;

public class CustomException extends Exception {
    // 생성자를 통해 예외 메시지를 설정하는 사용자 정의 예외 클래스
    public CustomException(String message) {
        super(message); // 부모 클래스인 Exception의 생성자 호출하여 예외 메시지 설정
    }
}
