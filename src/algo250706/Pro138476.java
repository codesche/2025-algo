package algo250706;

import java.util.*;

// 프로그래머스 - 귤 고르기 (Lv2)
public class Pro138476 {

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int tanger : tangerine) {
            map.put(tanger, map.getOrDefault(tanger, 0) + 1);
        }

        // 귤 크기 담은 리스트 생성
        List<Integer> list = new ArrayList<>(map.keySet());

        // 내림차순 정렬
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        // k의 개수만큼 상자에 담기
        for (Integer i : list) {
            if (k <= 0) break;

            answer++;
            k -= map.get(i);
        }

        return answer;
    }

}
