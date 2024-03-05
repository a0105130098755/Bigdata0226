package 더하기싸이클;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int originalNumber = N;

        int count = 0;

        do {
            int sum = (N / 10 + N % 10) % 10;
            N = (N % 10) * 10 + sum;
            count++;
        } while (N != originalNumber);

        System.out.println(count);
    }
}

