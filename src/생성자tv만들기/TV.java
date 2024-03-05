package 생성자tv만들기;

public class TV {
    private String brand;
    private int screenSize;
    private boolean isSmartTV;

    // TV 클래스의 생성자(Constructor)
    public TV(String brand, int screenSize, boolean isSmartTV) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
    }

    // TV의 브랜드를 반환하는 메소드
    public String getBrand() {
        return brand;
    }

    // TV의 화면 크기를 반환하는 메소드
    public int getScreenSize() {
        return screenSize;
    }

    // TV가 스마트 TV인지 여부를 반환하는 메소드
    public boolean isSmartTV() {
        return isSmartTV;
    }

    public static void main(String[] args) {
        // 생성자를 이용하여 TV 객체 생성
        TV myTV = new TV("Samsung", 55, true);

        // TV의 속성 출력
        System.out.println("브랜드: " + myTV.getBrand());
        System.out.println("화면 크기: " + myTV.getScreenSize() + " inches");
        System.out.println("스마트 TV 여부: " + (myTV.isSmartTV() ? "Yes" : "No"));
    }
}

