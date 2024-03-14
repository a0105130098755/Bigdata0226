package 트리셋;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetAndTreeMapEx {

    public static void main(String[] args) {
        // TreeSet 예제
        System.out.println("TreeSet 예제:");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        System.out.println("TreeSet: " + treeSet);

        System.out.println();

        // TreeMap 예제
        System.out.println("TreeMap 예제:");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 12);
        System.out.println("TreeMap: " + treeMap);
    }
}
