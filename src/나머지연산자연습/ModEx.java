package 나머지연산자연습;

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("100의 자리 정수를 입력하세요: ");
    int number = scanner.nextInt();

    // 입력 받은 값이 100의 자리 정수인지 확인
    if (number < 100 || number > 999) {
        System.out.println("100의 자리 정수를 입력하세요.");
    } else {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        System.out.printf("100의 자리: %d%n10의 자리: %d%n1의 자리: %d%n", a, b, c);
    }

    scanner.close();
    }
}
