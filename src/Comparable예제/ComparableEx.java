package Comparable예제;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        // 학생들을 학번(id)을 기준으로 비교
        return this.id - other.id;
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 3));
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));

        // 학생들을 정렬
        Collections.sort(students);

        // 정렬된 학생들 출력
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getId());
        }
    }
}

