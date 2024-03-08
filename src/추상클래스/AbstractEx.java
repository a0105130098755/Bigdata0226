package 추상클래스;

abstract class Shape {
    abstract double calculateArea(); // 추상 메서드: 도형의 넓이를 계산하는 메서드

    void display() {
        System.out.println("This is a shape."); // 일반 메서드: 도형을 표시하는 메서드
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 추상 메서드의 구현
    double calculateArea() {
        return width * height;
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        // 추상 클래스는 직접 객체를 생성할 수 없음
        // Shape shape = new Shape(); // Error

        // 추상 클래스를 상속받은 구체 클래스를 이용하여 객체 생성
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        rectangle.display(); // This is a shape.
    }
}


