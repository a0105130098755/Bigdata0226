package 중첩인터페이스;

// 계산기 인터페이스 정의
interface Calculator {
    int calculate(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        // 익명 객체를 사용하여 Calculator 인터페이스를 구현하고, calculate 메서드를 재정의
        Calculator addition = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        // 익명 객체를 사용하여 Calculator 인터페이스를 구현하고, calculate 메서드를 재정의
        Calculator subtraction = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                return x - y;
            }
        };

        // 익명 객체를 사용하여 Calculator 인터페이스를 구현하고, calculate 메서드를 재정의
        Calculator multiplication = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                return x * y;
            }
        };

        // 익명 객체를 사용하여 Calculator 인터페이스를 구현하고, calculate 메서드를 재정의
        Calculator division = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                if (y != 0) {
                    return x / y;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
            }
        };

        // 익명 객체를 사용하여 계산기 기능 수행
        int result1 = addition.calculate(10, 5);
        System.out.println("10 + 5 = " + result1);

        int result2 = subtraction.calculate(10, 5);
        System.out.println("10 - 5 = " + result2);

        int result3 = multiplication.calculate(10, 5);
        System.out.println("10 * 5 = " + result3);

        int result4 = division.calculate(10, 5);
        System.out.println("10 / 5 = " + result4);

        int result5 = division.calculate(10, 0); // 0으로 나누는 경우
    }
}
