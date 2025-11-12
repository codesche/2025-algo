package algo251112;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 프로그래머스 - 전화번호 목록 (Lv2)
public class Pro42577_2 {
    public boolean solution(String[] phone_book) {
        // 전화번호 목록을 Set에 추가
        Set<String> numbers = new HashSet<>(Arrays.asList(phone_book));
        for (String number : phone_book) {
            numbers.add(number);
        }

        // 접두어 체크 - HashMap 로직과 동일
        for (String s : phone_book) {
            int length = s.length();
            for (int i = 1; i < length; i++) {
                if (numbers.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
