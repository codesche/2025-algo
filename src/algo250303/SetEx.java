package algo250303;

/*
- 입력된 데이터들을 중복없이 저장하고 싶을 때 사용하면 좋다.
- 중복을 허용하지 않는다.
- TreeSet은 정렬되어서 저장되지만, HashSet은 정렬을 보장하지 않는다.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("apple");
        ts.add("core");
        ts.add("banana");

        // 정렬된 순서로 출력
        for (String s : ts) {
            System.out.println(s);
        }

        HashSet<String> hs = new HashSet<>(ts);

        // 정렬되지 않은 채 출력
        for (String s : hs) {
            System.out.println(s);
        }

        // for 문내에서 요소 삭제 (밑의 주석 처리한 코드와 같음)
        hs.removeIf(element -> element.length() % 2 == 0);

        /*
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
         */

        // 삭제 결과
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
