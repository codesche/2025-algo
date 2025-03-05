package algo250305;

import java.util.*;

// 완주하지 못한 선수 - Lv1
public class Programmers42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int length = completion.length;
        for (int i = 0; i < length; i++) {
            if (!participant[i].equals(completion[i])) {        // 다른값인 경우
                answer = participant[i];
                return answer;
            }
        }

        answer = participant[participant.length - 1];           // 각 요소의 값이 일치한 경우
        return answer;
    }

    public static void main(String[] args) {
        Programmers42576 T = new Programmers42576();
        System.out.println(T.solution(new String[]{"leo", "kiki", "eden"},
            new String[]{"eden", "kiki"}));
    }
}
