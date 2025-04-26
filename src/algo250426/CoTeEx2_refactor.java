package algo250426;

/*
🧩 문제: 가장 가까운 같은 글자
설명
문자열 s가 주어질 때, 각 글자마다 가장 가까이 있는 같은 글자까지의 거리를 배열에 담아 리턴하시오.
만약 같은 글자가 없다면 -1을 기록합니다.
 */

import java.util.Arrays;
import java.util.HashMap;

public class CoTeEx2_refactor {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        // 기본값 -1로 설정
        Arrays.fill(answer, -1);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 현재 문자가 이미 map에 있으면 거리 계산
            if (map.containsKey(current)) {
                answer[i] = i - map.get(current);
            }

            // 현재 문자의 인덱스 갱신
            map.put(current, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        CoTeEx2_refactor T = new CoTeEx2_refactor();
        System.out.println(Arrays.toString(T.solution("banana")));
    }

}
