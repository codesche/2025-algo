package algo250121;

import java.util.*;
import java.util.Map.Entry;

// 의상 - Lv2
public class Pro42578 {
    public int solution(String[][] clothes) {
        int answer = 1;

        // HashMap 통한 데이터 처리
        HashMap<String, Integer> map = new HashMap<>();

        // HashMap에 2차원 배열 데이터 넣기 => key와 각 key별 갯수(value) 담기
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        // 조합 수 구하기
        for (Entry<String, Integer> entry : map.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        Pro42578 T = new Pro42578();
        System.out.println(T.solution(new String[][]
            {{"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}}));
    }

}
