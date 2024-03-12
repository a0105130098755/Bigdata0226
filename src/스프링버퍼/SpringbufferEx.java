package 스프링버퍼;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SpringbufferEx {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // 데이터를 소스 파일에 기록
        writeDataToFile(sourceFile, "Hello, Spring Buffer!");

        // 스프링 버퍼를 사용하여 데이터를 복사
        copyDataUsingSpringBuffer(sourceFile, destinationFile);

        // 목적지 파일에서 데이터 읽어와 출력
        String data = readDataFromFile(destinationFile);
        System.out.println("Copied Data: " + data);
    }

    // 파일에 데이터를 기록하는 메서드
    private static void writeDataToFile(String fileName, String data) {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일로부터 데이터를 읽어오는 메서드
    private static String readDataFromFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                data.append((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    // 스프링 버퍼를 사용하여 데이터를 파일에서 복사하는 메서드
    private static void copyDataUsingSpringBuffer(String sourceFile, String destinationFile) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
