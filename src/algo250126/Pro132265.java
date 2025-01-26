package algo250126;

import java.util.*;

// 롤케이크 자르기 - Lv2
public class Pro132265 {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> oldMap = new HashMap<>();         // 형
        Map<Integer, Integer> youngMap = new HashMap<>();       // 동생

        for (int value : topping) {
            youngMap.put(value, youngMap.getOrDefault(value, 0) + 1);
        }

        for (int value : topping) {
            oldMap.put(value, youngMap.getOrDefault(value, 0) + 1);

            if (youngMap.get(value) - 1 == 0) {
                youngMap.remove(value);
            } else {
                youngMap.put(value, youngMap.get(value) - 1);
            }

            if (oldMap.size() == youngMap.size()) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro132265 T = new Pro132265();
        System.out.println(T.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }

}
