package algo250116;

import java.util.*;

// 영어 끝말잇기 - Lv2
public class Pro12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int length = words.length;

        // 단어 중복 체크
        Map<String, Integer> map = new HashMap<>();

        // 끝말잇기 - words[i]의 끝문자 words[i + 1]의 첫문자가 일치해야 함[일치하지 않으면 틀린 것으로 간주]
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                String s1 = words[i - 1];           // 이전 단어
                String s2 = words[i - 2];           // 현재 단어

                char last = s1.charAt(s1.length() - 1);     // 이전 단어의 마지막 철자
                char first = s2.charAt(0);                  // 현재 단어의 첫번째 철자

                // 단어가 중복이거나 철자가 이어지지 않는 경우
                if (map.containsKey(s2) || last != first) {
                    answer[0] = (i % n) + 1;        // 번호
                    answer[1] = (i / n) + 1;        // 차례

                    return answer;
                }
            }
            map.put(words[i], 1);                   // 사용한 단어 맵에 저장
        }
        return answer;                              // 아무런 이슈가 없는 경우
    }
}
