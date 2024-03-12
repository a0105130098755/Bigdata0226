package 코코아톡;

import java.util.ArrayList;
import java.util.List;

// CocoaTok 추상 클래스 정의
public abstract class CocoaTok {
    private List<String> friendsList;

    public CocoaTok() {
        friendsList = new ArrayList<>();
    }

    // 추상 메서드 정의 - 메시지 전송
    public abstract void sendMessage(String message);

    // 추상 메서드 정의 - 메시지 수신
    public abstract void receiveMessage(String message);

    // 친구 추가 기능
    public void addFriend(String friend) {
        friendsList.add(friend);
        System.out.println(friend + "님이 친구 목록에 추가되었습니다.");
    }

    // 친구 목록 출력
    public void displayFriendsList() {
        System.out.println("친구 목록:");
        for (String friend : friendsList) {
            System.out.println("- " + friend);
        }
    }

    // 채팅방 참여 기능
    public void joinChatRoom(String roomName) {
        System.out.println("채팅방 '" + roomName + "'에 참여했습니다.");
    }

    // 코코아톡 시작
    public void startCocoaTok() {
        System.out.println("코코아톡을 시작합니다.");
    }

    // 코코아톡 종료
    public void stopCocoaTok() {
        System.out.println("코코아톡을 종료합니다.");
    }
}
