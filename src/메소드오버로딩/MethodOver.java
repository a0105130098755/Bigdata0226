package 메소드오버로딩;

public class MethodOver {
    // 정수형 두 개를 더하는 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 실수형 두 개를 더하는 메소드
    public double add(double a, double b) {
        return a + b;
    }

    // 정수형 세 개를 더하는 메소드
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 문자열을 이어붙이는 메소드
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}


