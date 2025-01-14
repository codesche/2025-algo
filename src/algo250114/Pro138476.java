package algo250114;

import java.util.*;

// 귤 고르기 - Lv2
public class Pro138476 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Map에 귤의 크기별 개수 담기
        for (int value : tangerine) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        // 귤의 크기 리스트 생성
        List<Integer> keyList = new ArrayList<>(map.keySet());

        // 귤의 개수별 내림차순 정렬
        // {5, 5, 4, 3, 3, 2, 2, 1}
        keyList.sort((((o1, o2) -> map.get(o2) - map.get(o1))));

        // k의 개수 만큼 상자에 담기
        for (Integer value : keyList) {
            if (k <= 0) break;
            answer++;
            k -= map.get(value);
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro138476 T = new Pro138476();
        System.out.println(T.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

}
