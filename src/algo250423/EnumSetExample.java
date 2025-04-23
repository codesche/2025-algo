package algo250423;

// EnumSet은 enum 타입을 저장하는 집합으로, 성능이 매우 빠르다.

import java.util.EnumSet;

enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        weekend.forEach(System.out::println);
    }
}
