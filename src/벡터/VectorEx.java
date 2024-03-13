package 벡터;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        // Integer를 저장하는 벡터 생성
        Vector<Integer> vector = new Vector<>();

        // 요소 추가
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // 요소 접근
        System.out.println("Vector Elements:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // 요소 제거
        vector.remove(1);

        // 수정된 요소 출력
        System.out.println("\nVector Elements after removing index 1:");
        for (int element : vector) {
            System.out.println(element);
        }
    }
}

