package Set인터페이스;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasicEx {

    public static void main(String[] args) {
        // HashSet 객체 생성
        Set<String> stringSet = new HashSet<>();

        // 요소 추가
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Apple"); // 중복된 요소 추가 시도

        // 요소 출력
        System.out.println("HashSet의 크기: " + stringSet.size());

        // 반복자를 이용한 요소 순회 및 출력
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 요소 삭제
        stringSet.remove("Banana");

        // 삭제 후 요소 출력
        System.out.println("\nBanana 삭제 후:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }

        // 요소 존재 여부 확인
        System.out.println("\nOrange가 존재하는가? " + stringSet.contains("Orange"));
        System.out.println("Grape가 존재하는가? " + stringSet.contains("Grape"));
    }
}
