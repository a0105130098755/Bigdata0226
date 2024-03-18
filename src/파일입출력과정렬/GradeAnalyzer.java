package 파일입출력과정렬;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return total / 3.0;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + math;
    }
}

public class GradeAnalyzer {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("students.txt"))) {
            while (scanner.hasNextLine()) {
                String[] info = scanner.nextLine().split(" ");
                String name = info[0];
                int kor = Integer.parseInt(info[1]);
                int eng = Integer.parseInt(info[2]);
                int math = Integer.parseInt(info[3]);
                students.add(new Student(name, kor, eng, math));
            }
        } catch (FileNotFoundException e) {
            System.err.println("파일을 찾을 수 없습니다: " + e.getMessage());
            System.exit(1);
        }

        // 학생 객체를 총점순으로 정렬하고, 총점이 같으면 이름으로 정렬
        students.sort(Comparator.comparing(Student::getTotal).reversed().thenComparing(Student::getName));


        // 등수 부여
        int rank = 1;
        for (int i = 0; i < students.size(); i++) {
            if (i > 0 && students.get(i).getTotal() != students.get(i - 1).getTotal()) {
                rank = i + 1;
            }
            System.out.printf("등수: %d, 이름: %s, 총점: %d, 평균: %.2f\n",
                    rank, students.get(i).getName(), students.get(i).getTotal(), students.get(i).getAverage());
        }
    }
}

