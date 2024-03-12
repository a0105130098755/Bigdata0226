package 이분검색;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 길이 입력 받기
        System.out.print("배열의 길이를 입력하세요: ");
        int length = scanner.nextInt();

        // 배열 생성 및 랜덤 수로 초기화
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // 0부터 99까지의 랜덤한 수 생성
        }

        // 생성된 배열 정렬
        Arrays.sort(array);
        System.out.println("생성된 배열 (정렬 후): " + Arrays.toString(array));

        // 찾을 수 입력 받기
        System.out.print("찾을 수를 입력하세요: ");
        int searchNumber = scanner.nextInt();

        // 배열 내에서 이분 검색을 수행하여 해당 값이 존재하는지 확인
        boolean found = binarySearch(array, searchNumber);

        // 이분 검색 결과 출력
        if (found) {
            System.out.println("배열 내에 " + searchNumber + "가 존재합니다.");
        } else {
            System.out.println("배열 내에 " + searchNumber + "가 존재하지 않습니다.");
        }

        scanner.close();
    }

    // 이분 검색 메서드
    private static boolean binarySearch(int[] array, int searchNumber) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == searchNumber) {
                return true; // 찾은 경우
            } else if (array[mid] < searchNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // 찾지 못한 경우
    }
}

