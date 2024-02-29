package 반복문연습문제1;

import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("양의 정수를 입력해주세요.");
            return;
        }

        // n * n 크기의 행렬 출력
        printMatrix(n);

        scanner.close();
    }

    // n * n 크기의 행렬 출력 메소드
    public static void printMatrix(int n) {
        int maxLength = String.valueOf(n * n).length(); // 각 요소의 최대 길이 계산

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                String element = String.valueOf(i * j);
                int numSpaces = maxLength - element.length(); // 공백의 개수 계산
                System.out.print(element);
                // 각 열의 값들이 맞춰져서 출력되도록 공백 추가
                for (int k = 0; k < numSpaces; k++) {
                    System.out.print(" ");
                }
                System.out.print("\t"); // 탭으로 열 구분
            }
            System.out.println(); // 한 행 출력 후 줄 바꿈
        }
    }
}

