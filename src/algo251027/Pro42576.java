package algo251027;

import java.util.*;

public class Pro42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 명단을 추가
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 값이 0이 아닌 선수를 출력
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return "";
    }
}
