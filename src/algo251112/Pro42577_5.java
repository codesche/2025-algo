package algo251112;

import java.util.*;

// 이중 for문을 고려, 해시맵 고려 (map.containsKey() -> String or Integer)
public class Pro42577_5 {
    public boolean solution(String[] phone_book) {
        // 전화번호 목록을 Set에 추가
        Set<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(phone_book));

        // 접두어 체크
        for (String s : phone_book) {
            int length = s.length();
            for (int i = 1; i < length; i++) {
                if (numbers.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
