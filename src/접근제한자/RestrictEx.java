package 접근제한자;

// 접근제한자 클래스
public class RestrictEx {
    // private 접근제한자: 같은 클래스 내에서만 접근 가능
    private String privateVariable;

    // default 접근제한자: 같은 패키지 내에서 접근 가능
    String defaultVariable;

    // protected 접근제한자: 같은 패키지 내에서 또는 해당 클래스를 상속한 하위 클래스에서 접근 가능
    protected String protectedVariable;

    // public 접근제한자: 어디서든 접근 가능
    public String publicVariable;

    // private 접근제한자를 가진 메소드
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // default 접근제한자를 가진 메소드
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // protected 접근제한자를 가진 메소드
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // public 접근제한자를 가진 메소드
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}

