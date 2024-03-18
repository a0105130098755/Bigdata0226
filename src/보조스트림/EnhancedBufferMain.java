package 보조스트림;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EnhancedBufferMain {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "output.txt";

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            // 파일에 데이터 쓰기
            String data = "Hello, World!";
            bos.write(data.getBytes());
            System.out.println("파일에 데이터를 성공적으로 썼습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일에 데이터를 쓰는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

