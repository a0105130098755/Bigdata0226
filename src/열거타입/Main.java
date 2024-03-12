package 열거타입;

// 계절 열거 타입 정의
enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class Main {
    public static void main(String[] args) {
        // 각 계절을 열거 타입으로 표현
        Season currentSeason = Season.SPRING;

        // switch 문을 사용하여 계절에 따른 활동 출력
        switch (currentSeason) {
            case SPRING:
                System.out.println("현재 계절은 봄입니다. 꽃구경을 하세요.");
                break;
            case SUMMER:
                System.out.println("현재 계절은 여름입니다. 해수욕을 즐기세요.");
                break;
            case FALL:
                System.out.println("현재 계절은 가을입니다. 단풍구경을 하세요.");
                break;
            case WINTER:
                System.out.println("현재 계절은 겨울입니다. 스키를 타거나 눈사람을 만드세요.");
                break;
        }
    }
}

