package 상속적용Tv;

// 시제품 TV 클래스
class InheritanceTV {
    private int size;
    private boolean isSmart;

    // 생성자
    public InheritanceTV(int size, boolean isSmart) {
        this.size = size;
        this.isSmart = isSmart;
    }

    // 정보 출력 메소드
    public void printInfo() {
        System.out.println("TV 크기: " + size + "인치");
        System.out.println("스마트 TV 여부: " + (isSmart ? "Yes" : "No"));
    }
}
