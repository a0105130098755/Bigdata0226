package 추상배우기;

class SmartPhone extends Phone {
    public SmartPhone(String name) {
        super(name);
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성 합니다.");
    }

    public void internet() {
        System.out.println("인터넷을 검색 합니다.");
    }
}

public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call();
}