package algo250423;

import java.util.TreeSet;

// TreeSet은 정렬된 순서대로 요소를 저장하는 집합
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        set.forEach(System.out::println);       // 알파벳 순으로 정렬
    }
}
