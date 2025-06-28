package algo250628;

import java.util.*;

// 프로그래머스 - 문자열 내림차순으로 배치하기 (Lv1)
public class Pro12917 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[s.length()];

        int idx = 0;
        for (char c : s.toCharArray()) {
            arr[idx++] = c;
        }

        Arrays.sort(arr);
        for (char ch : arr) {
            sb.append(ch);
        }

        return sb.reverse().toString();
    }
}
