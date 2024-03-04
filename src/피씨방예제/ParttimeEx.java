package 피씨방예제;

    import java.util.Scanner;

    import java.util.Scanner;

public class ParttimeEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int rejectedCount = 0;

        boolean[] occupied = new boolean[100];

        for (int i = 0; i < N; i++) {
            int seat = scanner.nextInt();

            if (!occupied[seat - 1]) {
                occupied[seat - 1] = true;
            } else {
                rejectedCount++;
            }
        }

        System.out.println(rejectedCount);
    }
}


