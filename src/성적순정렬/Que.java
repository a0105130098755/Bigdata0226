package 성적순정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine();
        }

        Arrays.stream(students)
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.split(" ")[1])))
                .map(s -> s.split(" ")[0])
                .forEach(System.out::println);
    }
}

