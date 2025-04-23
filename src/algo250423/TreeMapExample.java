package algo250423;

import java.util.TreeMap;

// TreeMap은 키를 정렬된 순서로 저장하는 맵이다.
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 3);
        map.put("Cherry", 1);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
