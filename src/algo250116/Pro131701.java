package algo250116;

import java.util.*;

// 연속 부분 수열 합의 개수 - Lv2
public class Pro131701 {
    public int solution(int[] elements) {
        int answer = 0;
        int length = elements.length;

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        // 길이를 2배로 증가
        for (int i = 0; i < 2; i++) {
            for (int element : elements) {
                list.add(element);
            }
        }

        // 원형 수열의 연속 부분 수열 합의 개수 구하기
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length; j++) {
                List<Integer> subList = list.subList(i, i + j);
                int sum = 0;
                for (int number : subList) {
                    sum += number;
                }
                set.add(sum);
            }
        }

        answer = set.size();
        return answer;
    }

    public static void main(String[] args) {
        Pro131701 T = new Pro131701();
        System.out.println(T.solution(new int[]{7, 9, 1, 1, 4}));
    }
}
