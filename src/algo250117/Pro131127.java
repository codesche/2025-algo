package algo250117;

import java.util.*;

// 할인 행사 - Lv2
public class Pro131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;         // 회원등록 날짜 (+1)

        // 제품과 수량을 담을 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        int length = want.length;

        // [{banana, 3}, {apple, 2}, {rice, 2}, {pork, 2}, {pot, 2}]
        for (int i = 0; i < length; i++) {
            map.put(want[i], number[i]);
        }

        // 1번째 - 모두 할인 가능[{banana, 3}, {apple, 2}, {rice, 2}, {pork, 2}, {pot, 2}] => 전부 0으로 떨어져야 됨
        // 2번째 - 할인이 아예 안 됨 X

        // discount 배열의 처음 10일 간 제품 목록을 HashMap과 비교
        // discount에 포함된 제품이 원하는 제품인 경우, 해당 제품의 수량을 하나 줄임
        for (int i = 0; i < 10; i++) {
            if (map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) - 1);
            }
        }

        if (isMatch(map)) {
            answer++;
        }

        // discount 배열에서 1씩 이동하며 확인 + 새로운 날짜 제품을 할인 제품 목록에서 수량을 하나씩 줄임
        // 제외되는 날짜 제품의 수량을 하나씩 늘림
        // 모든 값이 0인 경우 원하는 제품을 모두 구매한 것으로 확인
        int disLength = discount.length;
        for (int i = 10; i < disLength; i++) {
            if (map.containsKey(discount[i - 10])) {
                map.put(discount[i - 10], map.get(discount[i - 10]) + 1);
            }

            if (map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) - 1);
            }

            if (isMatch(map)) {
                answer++;
            }
        }
        return answer;
    }

    // 제품 일치 여부 확인
    public boolean isMatch(HashMap<String, Integer> map) {
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pro131127 T = new Pro131127();
        System.out.println(T.solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
            new int[]{3, 2, 2, 2, 1},
            new String[]{"chicken", "apple", "apple", "banana",
                "rice", "apple", "pork", "banana", "pork",
                "rice", "pot", "banana", "apple", "banana"}));
    }

}
