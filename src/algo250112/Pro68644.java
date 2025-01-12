package algo250112;

import java.util.*;

// 두 개 뽑아서 더하기 - Lv1
public class Pro68644 {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
