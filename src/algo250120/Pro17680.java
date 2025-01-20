package algo250120;

// [1차] 캐시 - Lv2
// 도시 이름 검색 -> 해당 도시와 관련된 맛집 게시물들 DB에서 읽어들임
// 성능 측정 결과 -> DB에서 게시물 가져올 때 시간이 너무 오래 걸림
// 성능 개선을 위해 DB 캐시를 적용해야 하는데 캐시 크기를 얼마로 해야 할지 고민

import java.util.*;

public class Pro17680 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        // 캐시 크기가 0일 경우
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> caches = new LinkedList<>();
        for (String s : cities) {
            String city = s.toLowerCase();      // 대소문자 구분 없음

            // cache miss
            if (!caches.contains(city)) {
                answer += 5;
                if (caches.size() >= cacheSize) {
                    caches.remove(0);
                }
                caches.add(city);
                continue;
            }

            // cache hit
            if (caches.contains(city)) {
                caches.remove(city);
                caches.add(city);
                answer += 1;
            }
        }
        return answer;
    }
}
