package algo250306;

import java.util.HashMap;

// 전화번호 목록 - HashMap을 활용한 풀이, 성공
public class Pro42577_2 {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            length = s.length();
            for (int j = 0; j < length; j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Pro42577_2 T = new Pro42577_2();
        System.out.println(T.solution(new String[]{"123","456","789"}));
    }
}
