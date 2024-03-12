package 평균은넘겠지;

import java.util.Scanner;

public class avareage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int testCaseCount = scanner.nextInt();

        for (int i = 0; i < testCaseCount; i++) {
            // 학생 수 입력
            int studentCount = scanner.nextInt();
            int[] scores = new int[studentCount];
            int sum = 0;

            // 점수 입력 및 총합 계산
            for (int j = 0; j < studentCount; j++) {
                scores[j] = scanner.nextInt();
                sum += scores[j];
            }

            // 평균 계산
            double average = (double) sum / studentCount;

            // 평균을 넘는 학생 수 계산
            int aboveAverageCount = 0;
            for (int score : scores) {
                if (score > average) {
                    aboveAverageCount++;
                }
            }

            // 평균을 넘는 학생의 비율 출력
            System.out.printf("%.3f%%\n", (double) aboveAverageCount / studentCount * 100);
        }

        scanner.close();
    }
}

