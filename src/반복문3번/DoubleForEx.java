package 반복문3번;

public class DoubleForEx {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // 한 단 출력 후 빈 줄 추가
        }
    }
}
