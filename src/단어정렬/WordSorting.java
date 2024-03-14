package 단어정렬;
//알파벳 소 문자로 이루 어진 N개의 단어가 들어 오면 아래와 같은 조건에 따라 정렬 하는 프로그램
//입력(Scanner) -> 리스트에 저장(ArrayList) -> 비교(comparing) -> 정렬(sorted,) -> 중복 제거(distinct) -> 출력(print)
import java.util.*;
import java.util.function.Function;

public class WordSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }


        words.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(Function.identity()))
                .distinct()
                .forEach(System.out::println);
    }
}