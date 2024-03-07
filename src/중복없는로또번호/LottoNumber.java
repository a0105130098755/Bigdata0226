package 중복없는로또번호;

import java.util.*;

public class LottoNumber {
    public static void main(String[] args) {
        // 중복 없는 로또 번호를 생성할 Set을 생성합니다.
        Set<Integer> lottoNumbers = new HashSet<>();

        // 난수 생성기를 생성합니다.
        Random random = new Random();

        // 6개의 중복 없는 로또 번호를 생성합니다.
        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1에서 45 사이의 난수 생성
            lottoNumbers.add(randomNumber); // 중복 없는 번호를 추가합니다.
        }

        // 생성된 로또 번호를 출력합니다.
        System.out.println("로또 번호:");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }
}

