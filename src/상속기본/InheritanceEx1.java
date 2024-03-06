package 상속기본;

class Animal {
    // 필드
    String species;
    int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal {
    String name;

    public Cat(String species, int age, String name) {
        super(species, age);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }

    public void printInfo() {
        System.out.println("이 고양이의 종은 " + species + "이고, 나이는 " + age + "살입니다.");
    }
}

public class InheritanceEx1 {
    public static void main(String[] args) {
        // 고양이 객체 생성
        Cat myCat = new Cat("고양이", 3, "야옹이");

        // 고양이의 정보 출력
        myCat.printInfo();

        // 고양이가 소리를 냄
        myCat.makeSound();

    }
}