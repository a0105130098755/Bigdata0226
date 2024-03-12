package 다운캐스트;

// 동물 클래스 정의
class Animal {
    public void sound() {
        System.out.println("동물 소리를 낸다.");
    }
}

// 개 클래스 정의 (동물 클래스를 상속받음)
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }

    public void wagTail() {
        System.out.println("꼬리를 흔든다.");
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        // Animal 타입으로 선언된 객체에 Dog 객체를 할당
        Animal animal = new Dog();

        // 다운캐스팅 시도
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 다운캐스팅
            dog.sound(); // 하위 클래스의 메서드 호출
            dog.wagTail(); // Dog 클래스의 고유한 메서드 호출
        } else {
            System.out.println("다운캐스팅 할 수 없습니다.");
        }
    }
}
