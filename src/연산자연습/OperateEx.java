package 연산자연습;

import java.util.Scanner;

public class OperateEx {
    public static void main(String[] args){
        int num1 = 10, num2 = 4;
        System.out.println(" +연산자: "+(num1+num2));
        System.out.println(" -연산자: "+(num1-num2));
        System.out.println(" *연산자: "+(num1*num2));
        System.out.println(" /연산자: "+(num1/num2));
        System.out.println(" /연산자: "+((double)num1/num2));
        System.out.println(" %연산자: "+(num1&num2));
        try{
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("0으로 나누면 안됩니다.!!!");
        }
        int num3 = 10;
        System.out.println(num3 += 2);
        System.out.println(num3 -= 2);
        System.out.println(num3 *= 2);
        System.out.println(num3 /= 2);

        int num4 = 10;
        System.out.println(++num4);
        System.out.println(num4);

        int x = 10;
        int y = 20;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean rst1, rst2, rst3;
        rst1 = (x> 0) && (x > y);
        rst2 = (x> 0) || (x > y);
        rst3 = !(x> 0) || (x > y);
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력 하세요");
        int age = sc.nextInt();
        String adult = (age>19) ? "성인입니다" : "미성년자입니다";
        System.out.println(adult);

        System.out.println("java jdk"+11.04+12);
        System.out.println(3+ 3.3+"java jdk");

        int val1 = 5, val2 = 5, val3 = 5;
        int rst11, rst22, rst33;
        rst11 = val1 + val2 * val3;
        rst22 = (val1 + val2)*val3;
        rst33 = val1 + (++val2) *val3;
        System.out.println(rst11);
        System.out.println(rst22);
        System.out.println(rst33);
    }
}
