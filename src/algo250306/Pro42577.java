package algo250306;

// 전화번호 목록 - Lv2, 실패

import java.util.*;

public class Pro42577 {
    public boolean solution(String[] phone_book) {
        int length = phone_book[0].length();

        int pLength = phone_book.length;
        for (int i = 1; i < pLength; i++) {
            if (phone_book[i].substring(0, length).equals(phone_book[0])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pro42577 T = new Pro42577();
        System.out.println(T.solution(new String[]{"123","456","789"}));
    }

}
