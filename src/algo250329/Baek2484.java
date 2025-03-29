package algo250329;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

// 백준 - 주사위 네개 (브론즈 2)
public class Baek2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int winner = 0;         // 최종 승자

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] dice = new int[4];
            Map<Integer, Integer> countMap = new HashMap<>();
            int maxDiceValue = 0;

            // 주사위 숫자 저장 및 빈도 계산
            for (int j = 0; j < 4; j++) {
                dice[j] = Integer.parseInt(st.nextToken());
                countMap.put(dice[j], countMap.getOrDefault(dice[j], 0) + 1);
                maxDiceValue = Math.max(maxDiceValue, dice[j]);
            }

            int sum = 0;
            if (countMap.containsValue(4)) {                // 같은 숫자가 4개인 경우
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 4) {
                        sum = 50000 + (key * 5000);
                        break;
                    }
                }
            } else if (countMap.containsValue(3)) {         // 같은 숫자가 3개인 경우
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 3) {
                        sum = 10000 + (key * 1000);
                        break;
                    }
                }
            } else if (countMap.size() == 2) {              // 같은 숫자가 2개씩 (2, 2)
                int pairSum = 0;
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 2) {
                        pairSum += key * 500;
                    }
                }
                sum = 2000 + pairSum;
            } else if (countMap.containsValue(2)) {         // 같은 숫자가 2개만 존재
                for (int key : countMap.keySet()) {
                    if (countMap.get(key) == 2) {
                        sum = 1000 + (key * 100);
                        break;
                    }
                }
            } else {        // 모두 다른 경우
                sum = maxDiceValue * 100;
            }

            winner = Math.max(winner, sum);
        }
        System.out.println(winner);
    }
}
