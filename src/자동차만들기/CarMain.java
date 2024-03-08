package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
            int destination = sc.nextInt();

            System.out.print("이동할 승객 수 입력 : ");
            int passengers = sc.nextInt();

            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();

            System.out.print("부가 기능 선택 [ON / OFF] : ");
            String additionalFeature = sc.next();

            switch (carType) {
                case 1:
                    Car sportsCar = new SportsCar("스포츠카", additionalFeature);
                    sportsCar.move(destination, passengers);
                    break;
                case 2:
                    Car sedan = new Sedan("승용차", additionalFeature);
                    sedan.move(destination, passengers);
                    break;
                case 3:
                    Car bus = new Bus("버스", additionalFeature);
                    bus.move(destination, passengers);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }

            System.out.println("계속 이동하시겠습니까? [Y/N]");
            String continueOption = sc.next();
            if (!continueOption.equalsIgnoreCase("Y")) {
                break;
            }
        }

        sc.close(); // Scanner 객체 닫기
    }
}

class Car {
    protected final double GAS_PRICE_PER_LITER = 2000;
    protected final int[] DESTINATIONS = {0, 400, 200, 150, 300};

    protected String name;
    protected double speed;
    protected int mileage;
    protected int tank;
    protected int seat;

    public Car(String name, double speed, int mileage, int tank, int seat) {
        this.name = name;
        this.speed = speed;
        this.mileage = mileage;
        this.tank = tank;
        this.seat = seat;
    }

    public void move(int destination, int passengers) {
        int distance = DESTINATIONS[destination];
        int fuelConsumption = (int) Math.ceil((double) distance / mileage);
        double totalFuelCost = fuelConsumption * GAS_PRICE_PER_LITER;
        int totalRefuel = (int) Math.ceil((double) fuelConsumption / tank);
        double totalTime = (double) distance / speed * 60;

        System.out.println("=====" + name + "=====");
        System.out.println("총 비용 : " + (int) totalFuelCost + "원");
        System.out.println("총 주유 횟수 : " + totalRefuel + "회");
        System.out.println("총 이동 시간 : " + (int) (totalTime / 60) + "시간 " + (int) (totalTime % 60) + "분");
    }
}

class SportsCar extends Car {
    public SportsCar(String name, String additionalFeature) {
        super(name, 250, 8, 30, 2);
        if (additionalFeature.equalsIgnoreCase("ON")) {
            speed *= 1.2; // 터보 기능
        }
    }
}

class Sedan extends Car {
    public Sedan(String name, String additionalFeature) {
        super(name, 200, 12, 45, 4);
        if (additionalFeature.equalsIgnoreCase("ON")) {
            seat++; // 트렁크 좌석으로 변경
        }
    }
}

class Bus extends Car {
    public Bus(String name, String additionalFeature) {
        super(name, 150, 5, 100, 20);
        if (additionalFeature.equalsIgnoreCase("ON")) {
            tank += 30; // 보조 연료탱크 추가
        }
    }
}