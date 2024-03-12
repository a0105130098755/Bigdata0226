package Array클래스;

import java.util.Arrays;

public class ArrayClassEx {
    public static void main(String[] args) {
        // 정렬할 배열
        int[] arr = {5, 2, 8, 1, 6};

        // 배열을 정렬 (오름차순)
        Arrays.sort(arr);
        System.out.println("오름차순으로 정렬된 배열: " + Arrays.toString(arr));

        // 배열을 역순으로 정렬
        reverseArray(arr);
        System.out.println("내림차순으로 정렬된 배열: " + Arrays.toString(arr));

        // 배열에서 특정 값의 인덱스 찾기
        int valueToFind = 8;
        int index = Arrays.binarySearch(arr, valueToFind);
        if (index >= 0) {
            System.out.println(valueToFind + "의 인덱스: " + index);
        } else {
            System.out.println(valueToFind + "를 찾을 수 없습니다.");
        }

        // 배열 복사하기
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("복사된 배열: " + Arrays.toString(copiedArray));

        // 배열 비교하기
        boolean isEqual = Arrays.equals(arr, copiedArray);
        System.out.println("두 배열이 동일한가? " + isEqual);
    }

    // 배열을 역순으로 정렬하는 메서드
    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

