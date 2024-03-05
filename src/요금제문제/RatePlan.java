package 요금제문제;

import java.util.Scanner;

public class RatePlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] callTimes = new int[N];

        for (int i = 0; i < N; i++) {
            callTimes[i] = scanner.nextInt();
        }

        int 영식요금 = 0;
        int 민식요금 = 0;

        for (int time : callTimes) {
            영식요금 += (time / 30) * 10;
            if (time % 30 > 0)
                영식요금 += 10;

            민식요금 += (time / 60) * 15;
            if (time % 60 > 0)
                민식요금 += 15;
        }


        if (영식요금 < 민식요금)
            System.out.println("Y " + 영식요금);
        else if (민식요금 < 영식요금)
            System.out.println("M " + 민식요금);
        else
            System.out.println("Y M " + 영식요금);
    }
}

