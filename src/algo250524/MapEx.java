package algo250524;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 삽입
        map.put("apple", 3);
        map.put("banana", 2);

        // 조회
        System.out.println(map.get("apple")); // 3

        // 존재 여부 확인
        System.out.println(map.containsKey("banana")); // true

        // 반복
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 삭제
        map.remove("apple");
    }
}
