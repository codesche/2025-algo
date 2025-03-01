package algo250301;

import java.util.ArrayList;
import java.util.List;

// 고정 배열이 가지고 있는 문제점을 해결하기 위해 만들어짐
// ArrayList는 동기화가 되지 않음
public class ArrayListEx    {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 객체 추가
        list.add(90);
        list.add(85);
        list.add(100);
        list.add(70);
        list.add(75);

        System.out.println(list);               // [90, 85, 100, 70, 75]

        list.add(2,60);
        System.out.println(list);               // [90, 85, 60, 100, 70, 75]

        // 객체 변경
        list.set(1, 70);
        System.out.println(list);               // [90, 70, 60, 100, 70, 75]

        // 객체 삭제
        list.remove(3);                  // [90, 70, 100, 70, 75]
        System.out.println(list);

    }
}
