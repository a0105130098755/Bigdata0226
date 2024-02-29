package 반복문1번;

import java.util.Scanner;
public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num;
            num--;

        }
        System.out.println("정수의 합 : "+ sum);
    }
}
