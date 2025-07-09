package algo250710;

import java.util.*;
import java.util.stream.*;

// 프로그래머스 - 두 개 뽑아서 더하기 (Lv1)
public class Pro68644 {
    public int[] solutions(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // 오름차순 정렬을 하고 싶다면 반드시 stream() 옆에 .sorted() 붙이기
        // 내림차순 정렬 - sorted(Comparator.reverseOrder())
        //    .mapToInt(Integer::intValue)
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
