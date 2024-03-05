package 영화표에매하기;

public class MovieTicket {
    // 예매하는 메소드 - 영화 제목과 인원 수를 입력받음
    public void bookTicket(String movieTitle, int numberOfPeople) {
        System.out.println("영화 \"" + movieTitle + "\"를 " + numberOfPeople + "명 예매했습니다.");
        // 예매 처리 로직
    }

    // 예매하는 메소드 - 영화 제목, 인원 수, 좌석 번호를 입력받음
    public void bookTicket(String movieTitle, int numberOfPeople, String seatNumber) {
        System.out.println("영화 \"" + movieTitle + "\"를 " + numberOfPeople + "명, 좌석 번호 " + seatNumber + "로 예매했습니다.");
        // 예매 처리 로직
    }

    // 예매하는 메소드 - 영화 제목, 인원 수, 좌석 번호, 상영 시간을 입력받음
    public void bookTicket(String movieTitle, int numberOfPeople, String seatNumber, String screeningTime) {
        System.out.println("영화 \"" + movieTitle + "\"를 " + numberOfPeople + "명, 좌석 번호 " + seatNumber + ", 상영 시간 " + screeningTime + "으로 예매했습니다.");
        // 예매 처리 로직
    }

    public static void main(String[] args) {
        MovieTicket ticketBooking = new MovieTicket();

        // 다양한 예매 방법에 따른 메소드 호출
        ticketBooking.bookTicket("어벤져스", 2);
        ticketBooking.bookTicket("인셉션", 3, "A3");
        ticketBooking.bookTicket("토이스토리", 4, "B5", "18:00");
    }
}

