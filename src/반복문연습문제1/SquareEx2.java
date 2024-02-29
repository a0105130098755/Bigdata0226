package 반복문연습문제1;

import java.util.Scanner;

public class SquareEx2 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimesBelowN(int n) {
        int primeSum = 0;
        for (int num = 2; num < n; num++) {
            if (isPrime(num)) {
                primeSum += num;
            }
        }
        return primeSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        if (n < 10) {
            System.out.println("10 이상의 수를 입력해주세요.");
            return;
        }

        int primeSum = sumOfPrimesBelowN(n);
        System.out.println("10 미만의 소수의 합: " + primeSum);

        scanner.close();
    }
}

