package algo250115;

import java.util.*;

// 모의고사 - Lv1
public class Pro42840 {
    public int[] solution(int[] answers) {
        int length = answers.length;
        int[] math1 = {1, 2, 3, 4, 5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0, 0, 0};        // count[0]: math1, count[1]: math2, count[2]: math3

        // 배열을 순회 하면서 카운트 증가 시키기
        for (int i = 0; i < length; i++) {
            if (answers[i] == math1[i % 5]) {               // 나머지 연산을 활용하여 답안 배열의 모든 요소를 순회할 수 있음
                count[0]++;
            }

            if (answers[i] == math2[i % 8]) {
                count[1]++;
            }

            if (answers[i] == math3[i % 10]) {
                count[2]++;
            }
        }

        // max 값 나옴
        int max = Math.max(Math.max(count[0], count[1]), count[2]);

        List<Integer> list = new ArrayList<>();
        int countLength = count.length;
        for (int i = 0; i < countLength; i++) {
            if (max == count[i]) {
                list.add(i);
            }
        }

        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i) + 1;        // 배열 요소가 0부터 이므로 1씩 더해줘서 답과 매칭시킴
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42840 T = new Pro42840();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 2})));
    }
}
