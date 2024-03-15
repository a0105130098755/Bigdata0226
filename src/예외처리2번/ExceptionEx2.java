package 예외처리2번;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx2 {
    public static void main(String[] args) {
        String filename = "nonexistent.txt";

        try {
            // 존재하지 않는 파일을 읽기 위해 파일 스캐너 생성
            Scanner scanner = new Scanner(new File(filename));

            // 파일 내용을 한 줄씩 읽어 출력
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // 파일 스캐너 닫기
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught!");
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
