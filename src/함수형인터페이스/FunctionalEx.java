package 함수형인터페이스;

// 함수형 인터페이스 정의
@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class FunctionalEx {
    public static void main(String[] args) {
        // 함수형 인터페이스 구현
        Adder adder = (a, b) -> a + b;

        // 두 수를 더하는 메서드 호출
        int result = adder.add(3, 5);
        System.out.println("Result: " + result); // 출력: 8
    }
}
