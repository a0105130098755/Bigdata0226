package 스위치문기본;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        System.out.print("성별을 입력하세요: (M/m, F/f)");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'M':
            case 'm':
                System.out.println("남성 입니다.");
                break;
            case 'F':
            case 'f':
                System.out.println("여성 입니다.");
        }
    }
}
