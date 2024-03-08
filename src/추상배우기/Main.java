package 추상배우기;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S22");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
