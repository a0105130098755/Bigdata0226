package 파이널스태틱;

public class FinalStaticEx {
    // final static 변수 정의 (원주율)
    public static final double PI = 3.14159;

    // final static 메서드 정의 (원의 넓이 계산)
    public static final double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;

        // 원의 넓이 계산
        double area = FinalStaticEx.calculateArea(radius);
        System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);

        // 상수인 PI에 접근
        System.out.println("원주율: " + FinalStaticEx.PI);
    }
}

