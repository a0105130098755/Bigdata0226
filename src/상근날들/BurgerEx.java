package 상근날들;

import java.util.Scanner;

public class BurgerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 햄버거와 음료 가격 설정
        double[] burgerPrices = {5.50, 6.00, 6.50}; // 햄버거 가격
        double[] drinkPrices = {1.50, 2.00}; // 음료 가격

        // 가장 저렴한 햄버거와 음료 선택
        double cheapestBurgerPrice = findCheapest(burgerPrices);
        double cheapestDrinkPrice = findCheapest(drinkPrices);

        // 할인 적용
        double discount = 50; // 할인액
        double totalPrice = cheapestBurgerPrice + cheapestDrinkPrice - discount;

        // 결과 출력
        System.out.println("세트 메뉴 가격 (할인 적용): $" + totalPrice);

        scanner.close();
    }

    // 배열에서 최저가를 찾는 메서드
    public static double findCheapest(double[] prices) {
        double cheapest = prices[0];
        for (double price : prices) {
            if (price < cheapest) {
                cheapest = price;
            }
        }
        return cheapest;
    }
}


