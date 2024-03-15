package 예외상황1번;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // 배열의 범위를 벗어난 인덱스에 접근
            int index = 10;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
    }
}

