package 데이트클래스;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateClassEx {
    public static void main(String[] args) {
        // 현재 시간을 가져오기 위해 Date 객체 생성
        Date currentDate = new Date();

        // 날짜와 시간을 포맷팅하기 위한 SimpleDateFormat 객체 생성
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 포맷팅된 현재 날짜와 시간 출력
        String formattedDateTime = dateFormat.format(currentDate);
        System.out.println("현재 날짜와 시간: " + formattedDateTime);
    }
}

