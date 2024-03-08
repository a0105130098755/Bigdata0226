package 인터페이스;

// 동물 인터페이스
interface Animal {
    void makeSound(); // 소리를 내는 메서드
    void move();      // 움직이는 메서드
}

// 구체적인 동물 클래스: 개
class Dog implements Animal {
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void move() {
        System.out.println("걷습니다.");
    }
}

// 구체적인 동물 클래스: 고양이
class Cat implements Animal {
    public void makeSound() {
        System.out.println("야옹!");
    }

    public void move() {
        System.out.println("걷거나 달립니다.");
    }
}

// 메인 클래스
public class AnimalEx {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // 멍멍!
        dog.move();      // 걷습니다.

        Animal cat = new Cat();
        cat.makeSound(); // 야옹!
        cat.move();      // 걷거나 달립니다.
    }
}

