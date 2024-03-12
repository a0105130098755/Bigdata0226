package 토커나이저;

import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        // 분리할 문자열
        String text = "Java is a programming language";

        // StringTokenizer를 사용하여 공백을 구분자로 문자열 분리
        StringTokenizer tokenizer = new StringTokenizer(text);

        // 분리된 토큰 출력
        System.out.println("분리된 토큰:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // 다른 구분자를 사용하여 문자열 분리
        String numbers = "1,2,3,4,5";
        StringTokenizer numberTokenizer = new StringTokenizer(numbers, ",");

        // 분리된 숫자 출력
        System.out.println("\n분리된 숫자:");
        while (numberTokenizer.hasMoreTokens()) {
            System.out.println(numberTokenizer.nextToken());
        }
    }
}
