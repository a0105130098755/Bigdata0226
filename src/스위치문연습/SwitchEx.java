package 스위치문연습;

import java.util.Scanner;

public class SwitchEx {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("계산식을 입력하세요: ");
            String input = scanner.nextLine();

            double result;

            // 공백 제거 후 입력된 문자열을 공백을 기준으로 분할
            String[] tokens = input.split("\\s+");

            if (tokens.length != 3) {
                System.out.println("올바른 계산식이 아닙니다.");
                return;
            }

            double operand1 = Double.parseDouble(tokens[0]);
            char operator = tokens[1].charAt(0);
            double operand2 = Double.parseDouble(tokens[2]);

            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = operand1 - operand2;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = operand1 * operand2;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    result = operand1 / operand2;
                    System.out.println("결과: " + result);
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
            }
        }
    }


