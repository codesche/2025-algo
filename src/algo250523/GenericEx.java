package algo250523;

import java.util.ArrayList;
import java.util.List;

// 제네릭 - 빌드 레벨에서 타입 체크하여 타입 안정성 제공, 타입 체크와 형변환을 생략할 수 있게 해주어
// 코드를 간결하게 만들어주는 기능
public class GenericEx {
    public int solution() {
        List<Integer> list = new ArrayList();
        list.add(10);
//        list.add("abc");        // 에러 발생

        int sum1 = (int)list.get(0) + (int)list.get(1);

        List<Integer> genericList = new ArrayList<>();
//        genericList.add(10);
//        genericList.add("abc");     // 문법(빌드 레벨) 오류 발생

        int sum2 = genericList.get(0) + genericList.get(1);

        return 0;
    }
}
