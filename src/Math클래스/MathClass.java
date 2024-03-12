package Math클래스;

public class MathClass {
    public static void main(String[] args) {
        // 삼각함수 계산 예제
        double angleInDegrees = 45.0;
        double angleInRadians = Math.toRadians(angleInDegrees); // 각도를 라디안으로 변환
        double sineValue = Math.sin(angleInRadians);
        double cosineValue = Math.cos(angleInRadians);
        double tangentValue = Math.tan(angleInRadians);

        System.out.println("각도: " + angleInDegrees);
        System.out.println("사인 값: " + sineValue);
        System.out.println("코사인 값: " + cosineValue);
        System.out.println("탄젠트 값: " + tangentValue);

        // 지수 함수 계산 예제
        double base = 2.0;
        double exponent = 3.0;
        double power = Math.pow(base, exponent);

        System.out.println(base + "의 " + exponent + "승: " + power);

        // 로그 함수 계산 예제
        double x = 10.0;
        double naturalLog = Math.log(x);
        double base10Log = Math.log10(x);

        System.out.println("자연 로그 값: " + naturalLog);
        System.out.println("밑이 10인 로그 값: " + base10Log);
    }
}
