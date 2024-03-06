package 집주소문제;

import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.nextLine();

            // 입력이 "0"이면 종료
            if (number.equals("0")) {
                break;
            }

            try {
                // 숫자인지 확인하고, 숫자가 범위를 벗어나지 않는지 확인
                long num = Long.parseLong(number);
                if (num < 0 || num > 9999) {
                    throw new IllegalArgumentException("숫자의 범위는 0부터 9999까지여야 합니다.");
                }

                // 숫자가 범위 내에 있다면 너비 계산하여 출력
                int totalWidth = 2 + number.length() - 1 + number.chars().map(c -> c == '1' ? 2 : (c == '0' ? 4 : 3)).sum();
                System.out.println(totalWidth);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
