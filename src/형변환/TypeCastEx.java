package 형변환;
import static java.lang.Integer.parseInt;

public class TypeCastEx {
    public static void main(String[] args){
        float num1 = 1, num2 = 4;
        double rst1 = num1 / num2;
        System.out.println(rst1);

        int value1 = parseINT("123");
        double value2 = parseDouble("123.226541584541");
    }

    private static double parseDouble(String s) {
        return 0;
    }

    private static int parseINT(String s) {
        return 0;
    }
}
