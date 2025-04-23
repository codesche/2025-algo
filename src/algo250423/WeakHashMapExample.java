package algo250423;

import java.util.WeakHashMap;

// WeakHashMap은 키에 대한 강한 참조를 유지하지 않아서, GC가 키를 수거할 수 있다.
public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        String key = new String("key");
        map.put(key, "value");

        System.out.println(map.get(key));        // value
        key = null;                              // key 객체를 null로 설정
        System.gc();                             // 가비지 컬렉션 강제로 실행
        System.out.println(map.get(key));        // null
    }
}
