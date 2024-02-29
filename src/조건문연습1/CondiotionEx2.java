package 조건문연습1;

import java.util.Scanner;

public class CondiotionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println((ch + "는 알파벳 문자입니다"));
        }
    }
}
