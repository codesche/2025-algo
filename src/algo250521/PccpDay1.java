package algo250521;

import java.util.*;

// PCCP 준비 - 가장 가까운 글자 찾기
// 문자열 s가 주어졌을 때, 각 문자를 기준으로 가장 가까운 앞의 같은 문자와의 거리 구하기
// banana
public class PccpDay1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndex = new HashMap<>();

        // 구현 시작
        int length = answer.length;
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (lastIndex.containsKey(ch)) {
                answer[i] = i - lastIndex.get(ch);
            } else {
                answer[i] = -1;
            }

            lastIndex.put(ch, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        PccpDay1 T = new PccpDay1();
        System.out.println(Arrays.toString(T.solution("banana")));
    }


}
