package 파일스캐너사용;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerEx {
    public static void main(String[] args) {
        // 파일 경로 설정
        String filePath = "example.txt";

        // 파일 스캐너를 이용하여 파일에서 데이터를 읽어옴
        try (Scanner scanner = new Scanner(new File(filePath))) {
            // 파일 끝에 도달할 때까지 반복하여 읽어오기
            while (scanner.hasNextLine()) {
                // 한 줄씩 읽어온 데이터를 콘솔에 출력
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }
}
