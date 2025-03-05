package algo250305;

import java.util.HashMap;

// 완주하지 못한 선수_2 - Lv1
public class Programmers42576_2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 해시맵 선언
        HashMap<String, Integer> map = new HashMap<>();

        // participant 배열 순회하면서 각 참가자의 이름 해시맵에 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // completion 배열 순회하면서 각 완주자의 이름의 값을 해시맵에서 감소시킴
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 해시맵을 순회하면서 값이 0이 아닌 키(참가자 이름) 찾으면 됨
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers42576_2 T = new Programmers42576_2();
        System.out.println(T.solution(new String[]{"leo", "kiki", "eden"},
            new String[]{"eden", "kiki"}));
    }
}
