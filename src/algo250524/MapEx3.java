package algo250524;

import java.util.*;

// 배열에서 가장 많이 등장한 숫자
public class MapEx3 {
    public static int mostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int answer = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{1, 1, 2, 2, 2, 4, 5, 6, 6, 7, 7, 7, 7}));
    }

}
