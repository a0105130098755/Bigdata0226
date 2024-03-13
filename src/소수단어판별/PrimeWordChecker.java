package 소수단어판별;

import java.util.Scanner;

public class PrimeWordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas put some word: ");
        String word = scanner.nextLine();

        int sum = calculateWordSum(word);

        String result = isPrime(sum, true) ? "It is a prime word." : " It is not a prime word.";
        System.out.println(result);

        scanner.close();
    }
    private static int toNumber(char ch) {
        return Character.isLowerCase(ch) ? ch - 'a' + 1 : Character.isUpperCase(ch) ? ch - 'A' + 27 : 0;
    }
    private static int calculateWordSum(String word) {
        return word.chars()
                .map(ch -> toNumber((char) ch))
                .sum();
    }
    private static boolean isPrime(int n, boolean includeOne) {
        return n > 1 &&
                java.util.stream.IntStream.rangeClosed(includeOne ? 1 : 2, (int) Math.sqrt(n))
                        .noneMatch(i -> n % i == 0);
    }
}



