package 제네릭;

import java.util.ArrayList;
import java.util.List;

// 제네릭 클래스 정의
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Genenric {
    public static void main(String[] args) {
        // 문자열을 담는 Box 생성
        Box<String> stringBox = new Box<>("Hello, Generics!");

        // 숫자를 담는 Box 생성
        Box<Integer> integerBox = new Box<>(42);

        // Box에서 값 가져오기
        String str = stringBox.getContent();
        int num = integerBox.getContent();

        System.out.println("String Box Content: " + str);
        System.out.println("Integer Box Content: " + num);

        // 제네릭 컬렉션 사용 예제
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        System.out.println("Double List Contents: " + doubleList);
    }
}

