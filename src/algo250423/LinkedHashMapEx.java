package algo250423;

import java.util.LinkedHashMap;

// LinkedHashMap은 삽입된 순서대로 요소를 저장하는 맵이다.
public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
