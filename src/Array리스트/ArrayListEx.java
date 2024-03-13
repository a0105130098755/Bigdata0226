package Array리스트;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // String을 저장하는 ArrayList 생성
        ArrayList<String> stringList = new ArrayList<>();

        // 데이터 추가
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // 데이터 출력
        System.out.println("String List:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Integer를 저장하는 ArrayList 생성
        ArrayList<Integer> integerList = new ArrayList<>();

        // 데이터 추가
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // 데이터 출력
        System.out.println("\nInteger List:");
        for (int num : integerList) {
            System.out.println(num);
        }

        // Double을 저장하는 ArrayList 생성
        ArrayList<Double> doubleList = new ArrayList<>();

        // 데이터 추가
        doubleList.add(3.14);
        doubleList.add(2.71);
        doubleList.add(1.618);

        // 데이터 출력
        System.out.println("\nDouble List:");
        for (double num : doubleList) {
            System.out.println(num);
        }
    }
}

