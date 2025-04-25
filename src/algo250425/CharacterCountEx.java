package algo250425;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountEx {
    public Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
