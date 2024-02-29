package 반복문2번;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요");
        int age;
        while(true) {
            age = sc.nextInt();
            if (age >= 0 && age < 200) break;
            System.out.println("나이를 잘못 입력하셨습니다");

        }
        System.out.println("당신의 나이는 "+age+"입니다.");
    }
}