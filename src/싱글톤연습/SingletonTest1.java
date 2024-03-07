package 싱글톤연습;

public class SingletonTest1 {
    // Singleton 클래스를 활용하는 또 다른 예제입니다.
    public static void main(String[] args) {
        // 두 번째로 호출된 main 메서드에서도 같은 인스턴스를 사용합니다.
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
