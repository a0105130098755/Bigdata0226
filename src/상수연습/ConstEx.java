package 상수연습;

import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력하세요: ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은 "+ income * TAX_RATE);
    }
}
