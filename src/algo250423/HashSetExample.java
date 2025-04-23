package algo250423;

import java.util.HashSet;

// HashSet은 중복된 요소를 허용하지 않는 집합으로, 요소들이 해시로 저장된다.
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");       // 중복 추가 시 무시

        set.forEach(System.out::println);
    }
}
