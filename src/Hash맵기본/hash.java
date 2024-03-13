package Hash맵기본;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        // 해쉬 맵 생성
        Map<String, Integer> studentScores = new HashMap<>();

        // 학생들의 점수 추가
        studentScores.put("John", 90);
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 88);

        // 학생들의 점수 출력
        System.out.println("John's score: " + studentScores.get("John"));
        System.out.println("Alice's score: " + studentScores.get("Alice"));
        System.out.println("Bob's score: " + studentScores.get("Bob"));

        // 학생의 점수 업데이트
        studentScores.put("John", 95);
        System.out.println("Updated John's score: " + studentScores.get("John"));

        // 해쉬 맵의 크기 출력
        System.out.println("Size of HashMap: " + studentScores.size());

        // 모든 학생의 이름과 점수 출력
        System.out.println("All student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 특정 학생의 점수가 있는지 확인
        String studentName = "Alice";
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score exists: " + studentScores.get(studentName));
        } else {
            System.out.println(studentName + "'s score does not exist.");
        }

        // 특정 학생의 점수 삭제
        studentScores.remove("Bob");
        System.out.println("Bob's score removed. Size of HashMap: " + studentScores.size());
    }
}

