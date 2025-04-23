package algo250423;

import java.util.ArrayList;

// 동적 배열을 기반으로 하는 리스트, 빠른 랜덤 액세스와 크기 조정이 가능
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.forEach(System.out::println);
    }
}
