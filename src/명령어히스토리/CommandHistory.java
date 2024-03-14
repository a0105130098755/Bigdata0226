package 명령어히스토리;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<String> history; // 명령어 이력을 저장할 리스트
    private int maxSize; // 최대 저장 가능한 이력 크기
    private int currentIndex; // 현재 이력의 인덱스

    public CommandHistory(int maxSize) {
        this.maxSize = maxSize;
        this.history = new ArrayList<>();
        this.currentIndex = -1; // 초기에는 이력이 없으므로 -1로 설정
    }

    // 사용자의 명령어를 이력에 추가
    public void addCommand(String command) {
        // 최대 크기를 초과하는 경우 가장 오래된 이력 삭제
        if (history.size() == maxSize) {
            history.remove(0);
            currentIndex--;
        }
        history.add(command);
        currentIndex++;
    }

    // 이전 이력을 가져옴
    public String getPreviousCommand() {
        if (currentIndex >= 0) {
            return history.get(currentIndex--);
        } else {
            return "No previous command available";
        }
    }

    // 다음 이력을 가져옴
    public String getNextCommand() {
        if (currentIndex < history.size() - 1) {
            return history.get(++currentIndex);
        } else {
            return "No next command available";
        }
    }

    public static void main(String[] args) {
        CommandHistory commandHistory = new CommandHistory(5); // 최대 5개의 명령어를 저장하는 이력 생성

        // 사용자의 명령어 추가
        commandHistory.addCommand("ls -l");
        commandHistory.addCommand("cd /");
        commandHistory.addCommand("mkdir new_folder");
        commandHistory.addCommand("ls");
        commandHistory.addCommand("vim file.txt");

        // 이전 명령어 확인
        System.out.println("Previous command: " + commandHistory.getPreviousCommand());
        System.out.println("Previous command: " + commandHistory.getPreviousCommand());

        // 다음 명령어 확인
        System.out.println("Next command: " + commandHistory.getNextCommand());
        System.out.println("Next command: " + commandHistory.getNextCommand());
    }
}
