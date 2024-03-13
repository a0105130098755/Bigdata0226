package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        // 커피 메뉴와 가격을 해시맵으로 저장
        Map<String, Integer> coffeeMenu = new HashMap<>();
        coffeeMenu.put("에스프레소", 2000);
        coffeeMenu.put("아메리카노", 2500);
        coffeeMenu.put("카페라떼", 3000);
        coffeeMenu.put("카푸치노", 3500);
        coffeeMenu.put("바닐라라떼", 3500);

        // 사용자에게 메뉴 선택 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 커피 메뉴 ===");
        for (String menu : coffeeMenu.keySet()) {
            System.out.println(menu + " - " + coffeeMenu.get(menu) + "원");
        }
        System.out.print("원하는 커피를 입력하세요: ");
        String selectedCoffee = scanner.nextLine();

        // 선택한 커피의 가격 출력
        Integer price = coffeeMenu.get(selectedCoffee);
        if (price != null) {
            System.out.println(selectedCoffee + "는 " + price + "원입니다.");
        } else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }

        scanner.close();
    }
}

