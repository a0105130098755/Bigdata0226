package 객체를배열로관리;

import java.util.Scanner;

// 물품 클래스 정의
class Item {
    private String name;
    private int quantity;

    // 생성자
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 수량 반환
    public int getQuantity() {
        return quantity;
    }

    // 수량 증가
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    // 수량 감소
    public void decreaseQuantity(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 물품 수 입력 받기
        System.out.print("물품 수: ");
        int itemCount = scanner.nextInt();

        // 물품 객체 배열 생성
        Item[] items = new Item[itemCount];

        // 각 물품 정보 입력 받기
        for (int i = 0; i < itemCount; i++) {
            System.out.println("물품 " + (i + 1) + " 정보 입력:");
            System.out.print("이름: ");
            String name = scanner.next();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            // 물품 객체 생성 후 배열에 저장
            items[i] = new Item(name, quantity);
        }

        // 입력된 물품 정보 출력
        System.out.println("\n입력된 물품 정보:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("이름: " + items[i].getName() + ", 수량: " + items[i].getQuantity());
        }

        scanner.close();
    }
}


