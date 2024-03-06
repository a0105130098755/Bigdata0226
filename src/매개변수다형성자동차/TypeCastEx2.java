package 매개변수다형성자동차;

class Car {
    public void start() {
        System.out.println("자동차 시동을 건다.");
    }
}

class Sedan extends Car {
    @Override
    public void start() {
        System.out.println("세단 자동차를 시동 건다.");
    }
}

class SUV extends Car {
    @Override
    public void start() {
        System.out.println("SUV 자동차를 시동 건다.");
    }
}

public class TypeCastEx2 {
    // 다형성을 이용한 매개변수의 다양한 형태
    public static void drive(Car car) {
        car.start(); // 자동차 시동 걸기
    }

    public static void main(String[] args) {
        // 다형성을 이용하여 각각의 자동차를 운전
        Car sedan = new Sedan();
        Car suv = new SUV();

        drive(sedan); // 세단 자동차를 시동 건다.
        drive(suv); // SUV 자동차를 시동 건다.
    }
}
