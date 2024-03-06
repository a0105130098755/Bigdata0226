package 상속적용Tv;

// 프로토타입 TV 클래스 (상속을 통해 기본 기능 제공)
class ProtoTypeTV extends InheritanceTV {
    // 생성자
    public ProtoTypeTV(int size, boolean isSmart) {
        super(size, isSmart);
    }

    // 메소드 오버라이딩: 정보 출력 시 추가 정보 출력
    @Override
    public void printInfo() {
        super.printInfo(); // 부모 클래스의 메소드 호출
        System.out.println("이 TV는 프로토타입 모델입니다.");
    }
}

