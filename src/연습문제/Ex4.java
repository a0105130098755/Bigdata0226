package 연습문제;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int totalMinutes = H * 60 + M;
        int alarmMinutes = totalMinutes - 45;

        if (alarmMinutes < 0) {
            alarmMinutes += 24 * 60;
        }

        int alarmHour = alarmMinutes / 60;
        int alarmMinute = alarmMinutes % 60;

        System.out.println(alarmHour + " " + alarmMinute);
    }
}



