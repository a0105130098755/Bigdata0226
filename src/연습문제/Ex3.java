package 연습문제;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("제목을 입력하세요: ");
        String title = scanner.nextLine();

        System.out.print("날짜를 입력하세요 (예: 20230817): ");
        String date = scanner.nextLine();

        System.out.print("시간을 입력하세요 (예: 17): ");
        int time = scanner.nextInt();

        int month = Integer.parseInt(date.substring(4, 6));
        String season;


        if (month >= 3 && month <= 5) {
            season = "봄의 기운이 느껴지는 " + month + "월 입니다.";
        } else if (month >= 6 && month <= 8) {
            season = "여름의 더위가 식을 " + month + "월 입니다.";
        } else if (month >= 9 && month <= 11) {
            season = "가을의 향기가 나는 " + month + "월 입니다.";
        } else {
            season = "겨울의 한파가 찾아오는 " + month + "월 입니다.";
        }

        System.out.println("\n" + name + "님,");
        System.out.println(season + "\n");
        System.out.println("아래와 일정으로 " + title + "를 진행하고자 하오니");
        System.out.println("오셔서 자리를 빛내 주시기 바랍니다.\n");
        System.out.println("===== 행사 안내 =====");
        System.out.println("행사 안내 : " + title);
        System.out.println("일정 : " + date.substring(0, 4) + "년 " + month + "월 " + date.substring(6, 8) + "일");
        System.out.println("시간 : " + time + "시");
    }
}






