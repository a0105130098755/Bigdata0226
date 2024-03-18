package 스트림기본;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        // 정수 리스트 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 스트림을 이용하여 짝수를 걸러내고 각 값을 제곱한 후 합을 계산
        int sumOfSquaredEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // 짝수 필터링
                .mapToInt(num -> num * num) // 제곱 계산
                .sum(); // 합 계산

        System.out.println("짝수를 제곱한 값의 합: " + sumOfSquaredEvenNumbers);
    }
}

