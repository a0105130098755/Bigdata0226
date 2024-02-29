package 조건기본;

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요: ");
    int number = scanner.nextInt();

    if (number > 0) {
        System.out.println("양수입니다.");
    } else if (number < 0) {
        System.out.println("음수입니다.");
    } else {
        System.out.println("0입니다.");
    }
}}
