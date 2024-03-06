package 상속적용Tv;

// 양산용 TV 클래스 (상속을 통해 기본 기능 제공)
class ProductTV extends InheritanceTV {
    private boolean is4K;

    // 생성자
    public ProductTV(int size, boolean isSmart, boolean is4K) {
        super(size, isSmart);
        this.is4K = is4K;
    }

    // 메소드 오버로딩: 정보 출력 시 추가 정보 출력
    public void printInfo(boolean show4KInfo) {
        super.printInfo(); // 부모 클래스의 메소드 호출
        if (show4KInfo) {
            System.out.println("4K 지원 여부: " + (is4K ? "Yes" : "No"));
        }
    }
}
