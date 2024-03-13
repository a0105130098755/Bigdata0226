package ArrayList메뉴;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenuEx {
    public static void main(String[] args) {
        // 메뉴 아이템을 저장할 ArrayList 생성
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("1. 피자");
        menuItems.add("2. 햄버거");
        menuItems.add("3. 스파게티");
        menuItems.add("4. 샐러드");
        menuItems.add("5. 종료");

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자가 종료할 때까지 반복
        while (true) {
            // 메뉴 출력
            System.out.println("\n메뉴:");
            for (String item : menuItems) {
                System.out.println(item);
            }

            // 사용자 입력 받기
            System.out.print("\n원하는 항목을 선택하세요 (번호 입력): ");
            int choice = scanner.nextInt();

            // 선택한 항목 처리
            if (choice >= 1 && choice <= menuItems.size()) {
                String selectedItem = menuItems.get(choice - 1);
                System.out.println(selectedItem + "를 선택하셨습니다.");
                if (selectedItem.equals("5. 종료")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        // Scanner 닫기
        scanner.close();
    }
}

