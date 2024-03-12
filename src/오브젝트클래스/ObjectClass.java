package 오브젝트클래스;

// 예제 클래스 정의
class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() 메서드 재정의
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// 메인 클래스
public class ObjectClass {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person("John", 30);

        // 객체를 문자열로 출력
        System.out.println(person.toString());
    }
}
