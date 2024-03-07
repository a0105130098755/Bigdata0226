package 단어공부;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        int[] counts = new int[26];
        for (char ch : word.toCharArray())
            if (Character.isAlphabetic(ch)) counts[ch - 'a']++;
        int maxCount = 0, maxIndex = 0;
        for (int i = 0; i < counts.length; i++)
            if (counts[i] > maxCount) { maxCount = counts[i]; maxIndex = i; }
        char result = (char) ('A' + maxIndex);
        for (int count : counts)
            if (count == maxCount && count != 0) { result = '?'; break; }
        System.out.println(result);
    }
}


