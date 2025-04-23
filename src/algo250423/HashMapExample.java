package algo250423;

import java.util.HashMap;

// HashMap은 키-값 쌍을 저장하는 자료구조로, 빠른 검색을 지원한다.
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
