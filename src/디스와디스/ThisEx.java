package 디스와디스;

public class ThisEx {
    public static void main(String[]args) {
        Car car = new Car("Sonata", 2022, "Gray", 220);
    }
}

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
}
