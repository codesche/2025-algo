package algo251112;

import java.util.*;

public class Pro42577_7 {
    public boolean solution(String[] phone_book) {
        // 전화번호 목록 Set에 추가
        Set<String> numbers = new HashSet<>();
        for (String number : phone_book) {
            numbers.add(number);
        }

        // 접두어 체크
        for (String number : phone_book) {
            int length = number.length();
            for (int i = 1; i < length; i++) {
                if (numbers.contains(number.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
