package algo250114;

import java.util.*;

// 추억 점수 - Lv1
public class Pro176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // result 구하는 방법
        // may - 5, kein - 10, kain - 1, radi - 3
        // 그리움 점수 없는 것들은 무시한 채로 누적합 구하기

        // 길이 변수 선언
        int nameLength = name.length;
        int photoLength = photo.length;
        int[] answer = new int[photoLength];

        // 해시 맵 선언 - HashMap은 순서 보장 X
        HashMap<String, Integer> map = new HashMap<>();

        // 추억하는 사람 이름과 점수 매칭하여 HashMap에 저장
        for (int i = 0; i < nameLength; i++) {
            map.put(name[i], yearning[i]);
        }

        // 그룹별 배열 생성
        for (int i = 0; i < photoLength; i++) {
            String[] persons = photo[i];
            int total = 0;

            // HashMap에 포함된 사람이름에 매칭된 점수만 total 변수에 더하기
            for (String person : persons) {
                if (map.containsKey(person)) {
                    total += map.get(person);
                }
            }
            answer[i] = total;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro176963 T = new Pro176963();
        System.out.println(Arrays.toString(T.solution(
            new String[]{"may", "kein", "kain", "radi"},
            new int[]{5, 10, 1, 3},
            new String[][]{
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}}
        )));
    }
}
