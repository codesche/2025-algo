package algo250123;

import java.util.*;

// 전화번호 목록 - Lv2
public class Pro42577 {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {       // 접두어이므로 0부터 시작
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pro42577 T = new Pro42577();
        System.out.println(T.solution(new String[]{"119", "97674223", "1195524421"}));
    }

}
