package 문자스티림;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteStream {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "example.txt";

        // FileReader와 BufferedReader를 이용하여 파일에서 데이터를 읽어옴
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            // 한 줄씩 읽어오기
            while ((line = bufferedReader.readLine()) != null) {
                // 읽어온 데이터를 콘솔에 출력
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

