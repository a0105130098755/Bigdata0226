package 예외처리4번;


public class ExceptionEx4 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // 0으로 나누는 연산 수행
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
