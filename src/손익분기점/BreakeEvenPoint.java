package 손익분기점;

import java.util.Scanner;

public class BreakeEvenPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A, B, C 입력 받기
        int A = scanner.nextInt(); // 고정 비용
        int B = scanner.nextInt(); // 한 대 생산하는 데 가변 비용
        int C = scanner.nextInt(); // 노트북 가격

        // 손익분기점 계산
        // 총 수입 = 판매 대수 * 노트북 가격
        // 총 비용 = 고정 비용 + (판매 대수 * 가변 비용)
        // 총 수입이 총 비용보다 많아질 때까지 판매 대수를 증가시킴
        int breakEvenPoint = 0;
        if (C > B) {
            breakEvenPoint = A / (C - B) + 1;
        }

        // 출력
        System.out.println(breakEvenPoint > 0 ? breakEvenPoint : -1);
    }
}

