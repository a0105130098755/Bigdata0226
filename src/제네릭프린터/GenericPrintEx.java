package 제네릭프린터;

// 제네릭 프린터 클래스 정의
class GenericPrinter<T> {
    private T item;

    // 생성자
    public GenericPrinter(T item) {
        this.item = item;
    }

    // 아이템 출력 메서드
    public void printItem() {
        System.out.println("Printing item: " + item);
    }

    // 아이템 설정 메서드
    public void setItem(T item) {
        this.item = item;
    }

    // 아이템 가져오기 메서드
    public T getItem() {
        return item;
    }
}

public class GenericPrintEx {
    public static void main(String[] args) {
        // String 타입의 프린터 생성
        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Hello, Generics!");
        stringPrinter.printItem();

        // Integer 타입의 프린터 생성
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(42);
        integerPrinter.printItem();

        // Double 타입의 프린터 생성
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(3.14);
        doublePrinter.printItem();

        // 다른 아이템으로 변경
        stringPrinter.setItem("New String Item");
        integerPrinter.setItem(100);
        doublePrinter.setItem(2.718);

        // 변경된 아이템 출력
        stringPrinter.printItem();
        integerPrinter.printItem();
        doublePrinter.printItem();
    }
}

