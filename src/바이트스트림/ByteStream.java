package 바이트스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "example.txt";

        // FileInputStream을 이용하여 파일에서 데이터를 읽어옴
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int byteData;
            // 파일 끝에 도달할 때까지 반복하여 읽어오기
            while ((byteData = inputStream.read()) != -1) {
                // 읽어온 데이터를 콘솔에 출력
                System.out.print((char) byteData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
