package algo250531;

import java.util.*;

public class RunningRace {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();     // 선수 이름 -> 순위
        String[] result = Arrays.copyOf(players, players.length);

        // 초기 순위 설정
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String name : callings) {
            int currentRank = rankMap.get(name);
            if (currentRank > 0) {
                // 앞선 선수와 위치 교체
                String frontPlayer = result[currentRank - 1];

                // 순위 swap
                result[currentRank - 1] = name;
                result[currentRank] = frontPlayer;

                // Map에서도 순위 갱신
                rankMap.put(name, currentRank - 1);
                rankMap.put(frontPlayer, currentRank);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }

}
