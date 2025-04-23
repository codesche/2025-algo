package algo250423;

import java.util.LinkedList;

// LinkedList는 요소들이 링크로 연결된 리스트로, 삽입과 삭제가 빠르지만 랜덤 액세스는 느리다.
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        list.forEach(System.out::println);
    }
}
