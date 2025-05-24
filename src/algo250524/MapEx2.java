package algo250524;

import java.util.*;

// 문자열에서 빈도수 세기
public class MapEx2 {
    public static Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
