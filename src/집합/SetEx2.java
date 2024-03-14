package 집합;

import java.util.HashSet;
import java.util.Set;

public class SetEx2{

    public static void main(String[] args) {
        // 첫 번째 집합 생성
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // 두 번째 집합 생성
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // 합집합 계산
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // 차집합 계산
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // 결과 출력
        System.out.println("첫 번째 집합: " + set1);
        System.out.println("두 번째 집합: " + set2);
        System.out.println("합집합: " + union);
        System.out.println("차집합: " + difference);
    }
}

