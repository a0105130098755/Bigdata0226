package 싱글톤연습;

public class Singleton {
    // 정적 멤버 변수로 유일한 인스턴스를 저장합니다.
    private static Singleton instance;

    // private 생성자를 선언하여 외부에서 인스턴스를 생성할 수 없도록 합니다.
    private Singleton() {}

    // 정적 메서드를 통해 유일한 인스턴스를 반환합니다.
    public static Singleton getInstance() {
        // 인스턴스가 생성되지 않은 경우에만 인스턴스를 생성합니다.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 싱글톤 클래스의 다른 메서드들을 정의할 수 있습니다.
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}

