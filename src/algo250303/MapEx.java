package algo250303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/*
Map:
- 입력된 데이터들을 key와 Value로 저장하고 싶을 때, 탐색이 O(1)이기 때문에 특정한 값을 바로 읽어와야 할 때 사용한다.
- 중복을 허용하지 않는다.
- Key를 가지고 정렬을 할 수 있다.
 */
public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("key1", 1);
        hm.put("key2", 2);
        hm.put("key3", 3);

        if (hm.containsKey("key1") && hm.containsValue(1)) {
            System.out.println("YES");
        }

        hm.put("key1", hm.getOrDefault(("key1"), 0) * 10);

        List<String> keyList = new ArrayList<>(hm.keySet());

        // 오름차순으로 키 정렬
        // return Integer.compare(v2, v1) => 내림차순으로 키 정렬
        Collections.sort(keyList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int v1 = hm.get(s1);
                int v2 = hm.get(s2);

                return Integer.compare(v1, v2);
            }
        });

        // 출력
        for (String s : keyList) {
            System.out.println(s + " = " + hm.get(s));
        }

        System.out.println(hm.size());
    }
}
