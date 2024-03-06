package 매개변수의다형성;

class Animal {
    public void sound() {
        System.out.println("동물 소리를 내다.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹~");
    }
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("음메~");
    }
}

public class TypeCastEx {
    // 다형성을 이용한 매개변수의 다양한 형태
    public static void makeSound(Animal animal) {
        animal.sound(); // 동물 소리 출력
    }

    public static void main(String[] args) {
        // 다형성을 이용하여 각각의 동물이 소리를 내도록 함
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        makeSound(dog); // 멍멍!
        makeSound(cat); // 야옹~
        makeSound(cow); // 음메~
    }
}
