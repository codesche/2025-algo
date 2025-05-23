package algo250523;

import java.util.*;

// 프로그래머스 - 두 개 뽑아서 더하기(Lv1), 다른 풀이
public class ArrayEx3_2 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // list -> array로 변환 (stream 선언 -> 정렬 -> int 변환 -> 배열로 변환)
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
