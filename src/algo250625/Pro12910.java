package algo250625;

import java.util.*;

// 프로그래머스 - 나누어 떨어지는 숫자 배열 (Lv1)
public class Pro12910 {
    public List<Integer> solution (int[] arr, int divisor) {
        List<Integer> numberList = new ArrayList<>();

        for (int number : arr) {
            if (number % divisor == 0) {
                numberList.add(number);
            }
        }

        if (numberList.isEmpty()) {
            numberList.add(-1);
        }

        // 오름차순 정렬
        Collections.sort(numberList);

        return numberList;
    }
}
