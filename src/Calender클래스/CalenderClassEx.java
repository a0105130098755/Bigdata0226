package Calender클래스;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalenderClassEx {
    public static void main(String[] args) {
        // 현재 시간을 가져오기 위해 Calendar 객체 생성
        Calendar calendar = Calendar.getInstance();

        // 날짜와 시간을 포맷팅하기 위한 SimpleDateFormat 객체 생성
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");

        // 포맷팅된 현재 날짜와 시간 출력
        String formattedDateTime = dateFormat.format(calendar.getTime());
        System.out.println("현재 날짜와 시간: " + formattedDateTime);
    }
}

