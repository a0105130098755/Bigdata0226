package 전자레인지;

import java.util.Scanner;

public class MicroWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 요리시간 T 입력 받기

        // 버튼 A, B, C의 시간 설정
        int[] times = {300, 60, 10};
        int[] counts = new int[3]; // 버튼 A, B, C를 누른 횟수를 저장할 배열

        // 최소버튼 조작을 위한 버튼 누르기
        for (int i = 0; i < 3; i++) {
            counts[i] = T / times[i];
            T %= times[i];
        }

        // 남은 시간이 0이 아니면 -1 출력
        if (T != 0)
            System.out.println("-1");
        else
            System.out.println(counts[0] + " " + counts[1] + " " + counts[2]);
    }
}

