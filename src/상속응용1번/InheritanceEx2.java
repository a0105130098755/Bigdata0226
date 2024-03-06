package 상속응용1번;

// final 클래스
final class InheritanceEx2 {
    // final 메서드
    final void display() {
        System.out.println("부모 클래스의 display 메서드");
    }

    // final 변수
    final int number = 10;
}

// final 클래스를 상속하려고 시도하는 자식 클래스
// 아래 주석을 해제하면 컴파일 오류가 발생합니다.
//class Child extends Parent {
//    // 오류: cannot inherit from final Parent
//}

