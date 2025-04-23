package algo250423;

import java.util.EnumMap;

// EnumMap은 enum 타입을 키로 사용하는 맵
enum Color { RED, GREEN, BLUE }

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Color, String> map = new EnumMap<>(Color.class);
        map.put(Color.RED, "Red Color");
        map.put(Color.GREEN, "Green Color");
        map.put(Color.BLUE, "Blue Color");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
