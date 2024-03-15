package 예외처리6번;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) {
        String filename = "example.txt";
        BufferedReader reader = null;

        try {
            // 파일 읽기를 시도
            reader = new BufferedReader(new FileReader(filename));
            String line;

            // 파일에서 한 줄씩 읽어서 콘솔에 출력
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // 파일 읽기 중 예외 처리
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // 예외 발생 여부에 상관없이 파일 리소스 해제
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // 파일 닫기 중 예외 처리
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}

