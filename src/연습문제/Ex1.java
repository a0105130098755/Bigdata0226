package 연습문제;

import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("시험 성적을 입력하세요: ");
            int score = scanner.nextInt();

            char grade;

            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }

            System.out.println("등급: " + grade);
        }
    }


