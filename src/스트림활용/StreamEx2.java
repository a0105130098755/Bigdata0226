package 스트림활용;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        // 단어 리스트 생성
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear", "melon");

        // 스트림을 이용하여 길이가 5 이상인 단어만 필터링하여 새로운 리스트 생성
        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5) // 길이가 5 이상인 단어 필터링
                .collect(Collectors.toList()); // 새로운 리스트로 수집

        // 결과 출력
        System.out.println("길이가 5 이상인 단어들: " + longWords);
    }
}
