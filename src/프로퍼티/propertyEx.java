package 프로퍼티;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyEx {

    public static void main(String[] args) {
        // 새로운 Properties 객체 생성
        Properties properties = new Properties();

        try {
            // 프로퍼티 파일을 로드하여 읽기
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
            fis.close();

            // 값을 읽어옴
            String maxCartSize = properties.getProperty("maxCartSize");
            String paymentTimeout = properties.getProperty("paymentTimeout");
            String vatRate = properties.getProperty("vatRate");

            System.out.println("최대 장바구니 크기: " + maxCartSize);
            System.out.println("결제 시간 제한: " + paymentTimeout);
            System.out.println("부가세 비율: " + vatRate);

            // 새로운 프로퍼티 값 설정
            properties.setProperty("maxCartSize", "50");
            properties.setProperty("paymentTimeout", "600");
            properties.setProperty("vatRate", "10");

            // 변경된 값을 파일로 저장
            FileOutputStream fos = new FileOutputStream("config.properties");
            properties.store(fos, "Updated properties");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
