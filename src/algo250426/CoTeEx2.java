package algo250426;

/*
🧩 문제: 가장 가까운 같은 글자
설명
문자열 s가 주어질 때, 각 글자마다 가장 가까이 있는 같은 글자까지의 거리를 배열에 담아 리턴하시오.
만약 같은 글자가 없다면 -1을 기록합니다.
 */

import java.util.Arrays;
import java.util.HashMap;

public class CoTeEx2 {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (map.containsKey(current)) {
                answer[i] = i - map.get(current);
            } else {
                answer[i] = -1;
            }

            map.put(current, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        CoTeEx2 T = new CoTeEx2();
        System.out.println(Arrays.toString(T.solution("banana")));
    }

}
