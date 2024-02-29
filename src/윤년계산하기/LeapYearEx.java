package 윤년계산하기;

import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("연도를 입력하세요: ");
                int year = scanner.nextInt();

                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(year + (isLeapYear ? "년은 윤년입니다." : "년은 윤년이 아닙니다."));

                scanner.close();
            }
        }


