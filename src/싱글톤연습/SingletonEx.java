
package 싱글톤연습;

public class SingletonEx {
    // Singleton 클래스를 활용하는 예제입니다.
    public static void main(String[] args) {
        // Singleton 클래스의 getInstance() 메서드를 통해 인스턴스를 가져옵니다.
        Singleton singleton = Singleton.getInstance();

        // 인스턴스를 사용합니다.
        singleton.doSomething();
    }
}
