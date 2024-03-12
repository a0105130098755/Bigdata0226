package 디폴트메서드;

import java.util.ArrayList;
import java.util.List;

// Messenger 인터페이스 정의
public interface Messenger {
    List<String> contactsList = new ArrayList<>();

    // 메시지 전송
    void sendMessage(String message);

    // 메시지 수신
    void receiveMessage(String message);

    // 연락처 추가 기능 - 디폴드 메소드
    default void addContact(String contact) {
        contactsList.add(contact);
        System.out.println(contact + "님이 연락처에 추가되었습니다.");
    }

    // 연락처 목록 출력 - 디폴드 메소드
    default void displayContactsList() {
        System.out.println("연락처 목록:");
        for (String contact : contactsList) {
            System.out.println("- " + contact);
        }
    }

    // 대화 시작 기능 - 디폴드 메소드
    default void startConversation(String contact) {
        System.out.println(contact + "님과의 대화를 시작합니다.");
    }

    // 메신저 시작 - 정적 메소드
    static void startMessenger() {
        System.out.println("메신저를 시작합니다.");
    }

    // 메신저 종료 - 정적 메소드
    static void stopMessenger() {
        System.out.println("메신저를 종료합니다.");
    }
}
