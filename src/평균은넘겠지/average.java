package 평균은넘겠지;

import java.util.Arrays;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int testCaseCount = scanner.nextInt();

        for (int i = 0; i < testCaseCount; i++) {
            // 학생 수 입력
            int studentCount = scanner.nextInt();

            // 학생 점수 입력 및 평균 계산
            double average = Arrays.stream(new int[studentCount])
                    .map(j -> scanner.nextInt())
                    .average()
                    .orElse(0);

            // 평균을 넘는 학생의 비율 출력
            long aboveAverageCount = Arrays.stream(new int[studentCount])
                    .map(scanner::nextInt)
                    .filter(score -> score > average)
                    .count();

            System.out.printf("%.3f%%\n", (double) aboveAverageCount / studentCount * 100);
        }

        scanner.close();
    }
}

