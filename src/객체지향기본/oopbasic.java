package 객체지향기본;

// Animal 클래스 정의
class Animal {
    // 속성(멤버 변수) 정의
    String name;
    int age;

    // 생성자 정의
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드(동작) 정의
    public void introduce() {
        System.out.println("이 동물의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}

public class oopbasic {
    public static void main(String[] args) {
        // Animal 객체 생성
        Animal dog = new Animal("멍멍이", 3);
        Animal cat = new Animal("야옹이", 2);

        // 객체의 메서드 호출
        dog.introduce();
        cat.introduce();
    }
}

