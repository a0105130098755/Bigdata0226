package 대소문자바꾸기;

import java.util.Scanner;

public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String convertedString = input.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("변환된 문자열: " + convertedString);

        scanner.close();
    }
}

