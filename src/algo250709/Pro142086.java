package algo250709;

import java.util.*;

// 프로그래머스 - 가장 가까운 같은 글자 (Lv1)
public class Pro142086 {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                answer[i] = i - map.get(ch);
            } else {
                answer[i] = -1;
            }

            map.put(ch, i);
        }

        return answer;
    }
}
