package algo250423;

// CopyOnWriteArrayList는 멀티스레드 환경에서 안전하게 사용할 수 있는 리스트로,
// 쓰기 작업 시 복사본을 만든다.

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.forEach(System.out::println);
    }
}
