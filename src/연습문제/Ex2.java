package 연습문제;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 자리 정수를 입력하세요: ");
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int maxDigit = Math.max(Math.max(firstDigit, secondDigit), thirdDigit);

        System.out.println("가장 큰 자리수: " + maxDigit);
    }
}

