package 객체타입확인;

public class ObjectType {
    public static void main(String[] args) {
        // 객체 생성
        Animal cat = new Cat();
        Animal dog = new Dog();

        // 객체의 타입 확인
        if (cat instanceof Cat) {
            System.out.println("cat은 Cat 클래스의 인스턴스입니다.");
        } else {
            System.out.println("cat은 Cat 클래스의 인스턴스가 아닙니다.");
        }

        if (dog instanceof Dog) {
            System.out.println("dog은 Dog 클래스의 인스턴스입니다.");
        } else {
            System.out.println("dog은 Dog 클래스의 인스턴스가 아닙니다.");
        }
    }
}

// 부모 클래스
class Animal {}

// 자식 클래스들
class Cat extends Animal {}
class Dog extends Animal {}

