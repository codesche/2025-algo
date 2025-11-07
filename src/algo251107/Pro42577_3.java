package algo251107;

import java.util.*;

// 프로그래머스 - 전화번호 목록(Lv2), 정렬 + 인접 비교
// O(n log n) + 선형 탐색 O(n)
public class Pro42577_3 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);            // 정렬
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {      // 앞의 요소의 접두어와 뒤의 요소를 비교
                return false;
            }
        }
        return true;
    }
}
